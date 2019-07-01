package com.danyos.mygo.data.remote;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.danyos.mygo.data.TripStatusDataSource;
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
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class TripStatusApiDataSource implements TripStatusDataSource {

    private static final String TAG = "MyGO";
    private TransitFeedService service;
    private OkHttpClient client;

    public TripStatusApiDataSource() {
        client = new OkHttpClient();
    }


    @Override
    public LiveData<List<Tripstatus>> getTripStatus(String lineCd, String stationCd) {

        final MutableLiveData<List<Tripstatus>> data = new MutableLiveData<>();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TransitFeedService.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        TransitFeedService service = retrofit.create(TransitFeedService.class);

        service.listTrips(lineCd, stationCd).enqueue(
                new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        if (!response.isSuccessful())
                            return;

                        Log.d(TAG, "TransitFeedService called successfully!");

                        String apiResponse = response.body();
                        JSONArray jsonTripArray = JsonParser.getTripListFromXml(apiResponse);
                        Moshi moshi = new Moshi.Builder().build();
                        List<Tripstatus> tripstatusList = new ArrayList<Tripstatus>();

                        for (int i = 0; i < jsonTripArray.length(); i++) {
                            JSONObject trip = null;
                            try {
                                trip = jsonTripArray.getJSONObject(i);
                                JsonAdapter<Tripstatus> jsonAdapter = moshi.adapter(Tripstatus.class);
                                Tripstatus tripstatus = jsonAdapter.fromJson(trip.toString());
                                tripstatusList.add(tripstatus);

                            } catch (Exception e) {
                                Log.e(TAG, "Error", e);
                                e.printStackTrace();
                            }
                        }

                        data.setValue(tripstatusList);

                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Log.e(TAG, "Failure in TransitFeedService call", t);
                    }
                }
        );


        return data;

    }
}
























/*    @Override
    public List<Tripstatus> getTripStatus(String lineCd, String stationCd) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        List<Tripstatus> tripstatusList;
        TransitFeedService service = retrofit.create(TransitFeedService.class);
        Call<String> tripList = service.listTrips(lineCd, stationCd);
        tripList.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (!response.isSuccessful())
                    return;

                String apiResponse = response.body();
                JSONArray jsonTripArray = JsonParser.getTripListFromXml(apiResponse);
                Moshi moshi = new Moshi.Builder().build();
                List<Tripstatus> tripstatusList = new ArrayList<Tripstatus>();

                for (int i = 0; i < jsonTripArray.length(); i++) {
                    JSONObject trip = null;
                    try {
                        trip = jsonTripArray.getJSONObject(i);
                        JsonAdapter<Tripstatus> jsonAdapter = moshi.adapter(Tripstatus.class);
                        Tripstatus tripstatus = jsonAdapter.fromJson(trip.toString());
                        tripstatusList.add(tripstatus);
                        Log.d(TAG, "Trip: " + tripstatus.getTripNumber());

                    } catch (Exception e) {
                        Log.e(TAG, "Error",e );
                        e.printStackTrace();
                    }

                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }

        });*/


//
//        String urlString = MessageFormat.format(
//                BASE_URL,
//                lineCd,
//                stationCd
//        );
//
//
//        Log.i(TAG, "URL: " + urlString);
//        Request request = new Request.Builder()
//                .url(urlString)
//                .build();
//        try (Response response = client.newCall(request).execute()) {
//            String apiResponse = response.body().string();
//            JSONArray jsonTripArray = JsonParser.getTripListFromXml(apiResponse);
//            Moshi moshi = new Moshi.Builder().build();
//            List<Tripstatus> tripstatusList = new ArrayList<Tripstatus>();
//
//            for (int i = 0; i < jsonTripArray.length(); i++) {
//                JSONObject trip = jsonTripArray.getJSONObject(i);
//                JsonAdapter<Tripstatus> jsonAdapter = moshi.adapter(Tripstatus.class);
//                Tripstatus tripstatus = jsonAdapter.fromJson(trip.toString());
//                tripstatusList.add(tripstatus);
//
//            }
//
//            return tripstatusList;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

