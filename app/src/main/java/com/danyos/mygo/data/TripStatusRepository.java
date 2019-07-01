package com.danyos.mygo.data;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.danyos.mygo.data.remote.TripStatusApiDataSource;
import com.danyos.mygo.domain.Tripstatus;

import java.util.List;

public class TripStatusRepository {

    private TripStatusDataSource tripStatusDataSource;
    private MutableLiveData<List<Tripstatus>> allTrips;

    public TripStatusRepository(Application application) {
        this.tripStatusDataSource = new TripStatusApiDataSource();
        allTrips = getTripStatus("09", "13");
    }

    public MutableLiveData<List<Tripstatus>> getTripStatus(String lineCd, String stationCd) {
        return (MutableLiveData) tripStatusDataSource.getTripStatus(lineCd, stationCd);

    }

    public void updateTrips(String lineCd, String stationCd) {
        allTrips.postValue(tripStatusDataSource.getTripStatus(lineCd, stationCd).getValue());
    }


    public MutableLiveData<List<Tripstatus>> getAllTrips() {
        return allTrips;
    }


}
