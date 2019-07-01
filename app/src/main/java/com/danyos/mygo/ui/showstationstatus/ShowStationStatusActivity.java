package com.danyos.mygo.ui.showstationstatus;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.danyos.mygo.R;
import com.danyos.mygo.data.TripStatusDataSource;
import com.danyos.mygo.data.remote.TripStatusApiDataSource;
import com.danyos.mygo.domain.Tripstatus;

import java.util.List;


public class ShowStationStatusActivity extends AppCompatActivity {

    ProgressBar progressBar;
    private ShowStationStatusViewModel viewModel;

    public static final String TAG = "MyGO";
    private final String[] serviceInfo = new String[]{"09", "13"};
    Button btnGetSchedules;
    TripStatusDataSource dataSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_station_status);
        progressBar = findViewById(R.id.progressBar);
        btnGetSchedules = findViewById(R.id.button_getSchedules);
        dataSource = new TripStatusApiDataSource();

        //  Get the ViewModel
        viewModel = ViewModelProviders.of(this).get(ShowStationStatusViewModel.class);

        //  Create Observer which updates UI
        final Observer<List<Tripstatus>> tripObserver = new Observer<List<Tripstatus>>() {
            @Override
            public void onChanged(List<Tripstatus> tripstatuses) {

                if (tripstatuses != null) {
                    Log.d(TAG, "Total Trips: " + tripstatuses.size());
                    for (Tripstatus trip :
                            tripstatuses) {
                        Log.d(TAG, "Trip : " + trip.getTripNumber());
                    }
                } else {
                    Log.d(TAG, "Tripstatus list is empty");
                }

            }

        };

        //  Observe the LiveData, passing lifecycle owner and observer
        viewModel.getTripstatus().observe(this, tripObserver);


    }

    public void refreshSchedule(View view) throws InterruptedException {
        btnGetSchedules.setEnabled(false);
        viewModel.getTrips("09", "13");
        btnGetSchedules.setEnabled(true);
//        task.execute(serviceInfo);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
