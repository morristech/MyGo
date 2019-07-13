package com.danyos.mygo.data;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.danyos.mygo.data.remote.TripStatusApiDataSource;
import com.danyos.mygo.domain.Tripstatus;
import com.danyos.mygo.ui.showstationstatus.ShowStationStatusActivity;

import java.util.List;

public class TripStatusRepository {

    private static TripStatusRepository instance;
    private final MutableLiveData<List<Tripstatus>> data = new MutableLiveData<>();
    private TripStatusDataSource dataSource;

    public static TripStatusRepository getInstance(Context context) {
        if (instance == null) {
            instance = new TripStatusRepository(context);
        }
        return instance;
    }

    public TripStatusRepository(Context context) {
        dataSource = new TripStatusApiDataSource();
    }

    public void getTripsForLine(String lineCd, String stationCd) {
        data.postValue(dataSource.getTripStatus(lineCd, stationCd));
    }

    public MutableLiveData<List<Tripstatus>> getTrips() {
        if (data != null)
            return data;
        else {
            Log.e(ShowStationStatusActivity.TAG, "Returning null trips from repo");
            return null;
        }
    }


}
