package com.danyos.mygo.data.remote;

import android.util.Log;

import com.danyos.mygo.data.TripStatusDataSource;
import com.danyos.mygo.data.remote.api.TransitFeedService;
import com.danyos.mygo.domain.Tripstatus;
import com.danyos.mygo.util.JsonParser;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class TripStatusApiDataSource implements TripStatusDataSource {

    private static final String TAG = "MyGO";
    private OkHttpClient client;
    private TransitFeedService service;

    public TripStatusApiDataSource() {
        client = new OkHttpClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TransitFeedService.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        service = retrofit.create(TransitFeedService.class);
    }


    @Override

    public List<Tripstatus> getTripStatus(String lineCd, String stationCd) {

        List<Tripstatus> tripstatusList = new ArrayList<Tripstatus>();

        Call<String> call = service.listTrips(lineCd, stationCd);
        try {
            String response = call.execute().body();
            Log.d(TAG, "Request: " + call.request().toString());
            Log.d(TAG, "Response " + response.substring(0, 300));
            JSONArray jsonTripArray = JsonParser.getTripListFromXml(response);
            Moshi moshi = new Moshi.Builder().build();

            for (int i = 0; i < jsonTripArray.length(); i++) {
                JSONObject trip = null;
                trip = jsonTripArray.getJSONObject(i);
                JsonAdapter<Tripstatus> jsonAdapter = moshi.adapter(Tripstatus.class);
                Tripstatus tripstatus = jsonAdapter.fromJson(trip.toString());
                tripstatusList.add(tripstatus);
            }

        } catch (Exception e) {
            Log.e(TAG, "Error", e);
            e.printStackTrace();
        }

        Log.d(TAG, "Transit data parsed. Setting transit data. Trip count: " + tripstatusList.size());

        return tripstatusList;
    }

}


