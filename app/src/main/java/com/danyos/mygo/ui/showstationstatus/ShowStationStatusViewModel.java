package com.danyos.mygo.ui.showstationstatus;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.danyos.mygo.data.TripStatusDataSource;
import com.danyos.mygo.data.TripStatusRepository;
import com.danyos.mygo.data.remote.TripStatusApiDataSource;
import com.danyos.mygo.domain.Tripstatus;
import com.danyos.mygo.util.AppExecutors;

import java.util.List;

public class ShowStationStatusViewModel extends AndroidViewModel {

    private TripStatusRepository repository;
    public MutableLiveData<List<Tripstatus>> trips = new MutableLiveData<List<Tripstatus>>();

    public enum ViewState {LOADING, COMPLETE}

    private MutableLiveData<ViewState> viewState;
    AppExecutors executors;

    public ShowStationStatusViewModel(Application application) {
        super(application);
        TripStatusDataSource dataSource = new TripStatusApiDataSource();
        repository = new TripStatusRepository(application);
        init();

    }

    private void init() {
        if (viewState == null) {
            viewState = new MutableLiveData<>();
            viewState.setValue(ViewState.COMPLETE);
        }
        executors = AppExecutors.getInstance();
        trips = repository.getTrips();
    }

    public void getTripStatusForLineStation(String lineCd, String stationCd) {
        viewState.setValue(ViewState.LOADING);
        executors.diskIO().execute(new Runnable() {
            @Override
            public void run() {
                Log.d(ShowStationStatusActivity.TAG, "Executing IO");
                if (trips == null) {
                    Log.d(ShowStationStatusActivity.TAG, "Trips is null");
                } else {
                    repository.getTripsForLine(lineCd, stationCd);
                }

                viewState.postValue(ViewState.COMPLETE);
            }
        });

    }

    public MutableLiveData<List<Tripstatus>> getTrips() {
        return trips;
    }

    public MutableLiveData<ViewState> getViewState() {
        return viewState;
    }


}
