package com.danyos.mygo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.transit.realtime.GtfsRealtime;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {




    private static final String TAG = "MyGO";
    private final String METHOD = "getFeeds";
    private final String KEY = "4ece31c7-9a50-4e3b-9f6b-e75db9dc2847";
    private final String LIMIT = "10";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String urlString = MessageFormat.format(
                "https://api.transitfeeds.com/v1/{0}?key={1}&limit={2}",
                METHOD,
                KEY,
                LIMIT
        );

        Log.d(TAG, "URL: " + urlString);

        TransitFeedTask task = new TransitFeedTask();
        task.execute(urlString);

    }



}
