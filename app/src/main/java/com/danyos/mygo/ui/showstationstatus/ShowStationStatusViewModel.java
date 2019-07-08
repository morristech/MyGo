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

    public enum ViewState {LOADING, COMPLETE}

    private MutableLiveData<ViewState> viewState;

    public ShowStationStatusViewModel(Application application) {
        super(application);
        TripStatusDataSource dataSource = new TripStatusApiDataSource();
        repository = new TripStatusRepository(application);
        trips = repository.getTrips();
        init();
    }

    private void init() {
        if (viewState == null) {
            viewState = new MutableLiveData<>();
            viewState.setValue(ViewState.COMPLETE);
        }
    }

    public void getTripStatusForLineStation(String lineCd, String stationCd) {
        viewState.setValue(ViewState.LOADING);
        repository.getTrips();
    }

    public MutableLiveData<List<Tripstatus>> getTrips() {
        return trips;
    }

    public MutableLiveData<ViewState> getViewState() {
        return viewState;
    }


}
