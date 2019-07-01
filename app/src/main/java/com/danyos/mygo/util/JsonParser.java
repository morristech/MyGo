package com.danyos.mygo.util;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class JsonParser {

    private static final String TAG = "MyGO";

    public static JSONArray getTripListFromXml(String xml) {

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

            return tripStatusArray;

        } catch (Exception e) {
            Log.e(TAG, "Error", e);
            e.printStackTrace();
            return null;
        }

    }

}
