package com.danyos.mygo.data;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.danyos.mygo.data.remote.TripStatusApiDataSource;
import com.danyos.mygo.domain.Tripstatus;

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

    public MutableLiveData<List<Tripstatus>> getTrips() {
        data.setValue(dataSource.getTripStatus("09", "13").getValue());
        return data;
    }


}
