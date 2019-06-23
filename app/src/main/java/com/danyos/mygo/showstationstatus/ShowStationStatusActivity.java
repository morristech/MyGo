package com.danyos.mygo.showstationstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.danyos.mygo.R;
import com.danyos.mygo.showstationstatus.model.Tripstatus;
import com.danyos.mygo.util.TransitFeedTask;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.text.MessageFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ShowStationStatusActivity extends AppCompatActivity implements TransitFeedTask.AsyncResponse {

    TransitFeedTask task = new TransitFeedTask(this);


    private static final String TAG = "MyGO";
    private final String service = "09";
    private final String stationCd = "13";

    private final String endpoint =
            "http://gotracker.ca/GOTracker/web/GODataAPIProxy.svc/StationStatusJSON/Service/StationCd/Lang/{0}/{1}/en-US";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_station_status);

        String urlString = MessageFormat.format(
                endpoint,
                service,
                stationCd
        );

        Log.d(TAG, "URL: " + urlString);


        task.execute(urlString);




    }

    @Override
    public void processFinish(String output) {

        JSONArray tripStatusList = getTripListFromXml(output);
        try {
            JSONObject trip = tripStatusList.getJSONObject(0);

            Moshi moshi = new Moshi.Builder().build();
            JsonAdapter<Tripstatus> jsonAdapter = moshi.adapter(Tripstatus.class);

            Log.d(TAG, "Trip : \n" + trip.toString());
            Tripstatus tripstatus = jsonAdapter.fromJson(trip.toString());
            Log.d(TAG, "Trip: " + tripstatus.getDirection());


        } catch (Exception e) {
            Log.e(TAG, "Error :" , e);
            e.printStackTrace();
        }


    }

    private JSONArray getTripListFromXml(String xml) {

        DocumentBuilder builder;
        try {

            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource src = new InputSource();
        src.setCharacterStream(new StringReader(xml));

        Document document = builder.parse(src);
        String data = document.getElementsByTagName("Data").item(0).getTextContent();
//            Log.d(TAG, "Data: \n" + data);

        //  Parse Data node string to JSON
        JSONObject jsonObject = new JSONObject(data);
        JSONArray tripStatusArray = jsonObject.getJSONArray("TripStatus");

        Log.d(TAG, "Trips: " + tripStatusArray.length());

        return tripStatusArray;

        } catch (Exception e) {
            Log.e(TAG, "Error", e );
            e.printStackTrace();
            return null;
        }

    }



}
