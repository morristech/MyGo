package com.danyos.mygo.ui.showstationstatus;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.danyos.mygo.data.TripStatusDataSource;
import com.danyos.mygo.data.TripStatusRepository;
import com.danyos.mygo.data.remote.TripStatusApiDataSource;
import com.danyos.mygo.domain.Tripstatus;

import java.util.List;

public class ShowStationStatusViewModel extends AndroidViewModel {

    private TripStatusRepository repository;

    private final MutableLiveData<List<Tripstatus>> trips;

    public ShowStationStatusViewModel(Application application) {
        super(application);
        TripStatusDataSource dataSource = new TripStatusApiDataSource();
        repository = new TripStatusRepository(application);
        trips = repository.getAllTrips();
    }

    public void getTrips(String lineCd, String stationCd) {
        repository.updateTrips(lineCd, stationCd);
        trips.setValue(repository.getAllTrips().getValue());
    }


    public MutableLiveData<List<Tripstatus>> getTripstatus() {
        return trips;
    }

    @Override
    protected void onCleared() {
        super.onCleared();

    }
}
