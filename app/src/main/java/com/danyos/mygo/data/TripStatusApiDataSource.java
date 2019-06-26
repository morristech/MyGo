package com.danyos.mygo.data;

import java.io.IOException;
import java.text.MessageFormat;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TripStatusApiDataSource implements TripStatusDataSource {

    private final String endpoint =
            "http://gotracker.ca/GOTracker/web/GODataAPIProxy.svc/StationStatusJSON/Service/StationCd/Lang/{0}/{1}/en-US";
    private OkHttpClient client;

    public TripStatusApiDataSource() {
        client = new OkHttpClient();
    }

    @Override
    public String getTripStatus(String lineCd, String stationCd) {

        String urlString = MessageFormat.format(
                endpoint,
                lineCd,
                stationCd
        );

        Request request = new Request.Builder()
                .url(urlString)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
