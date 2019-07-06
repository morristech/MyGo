package com.danyos.mygo.ui.showstationstatus;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.danyos.mygo.R;
import com.danyos.mygo.data.TripStatusDataSource;
import com.danyos.mygo.domain.Tripstatus;


public class ShowStationStatusActivity extends AppCompatActivity {

    ProgressBar progressBar;
    private ShowStationStatusViewModel viewModel;
    private RecyclerView recyclerView;

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

        viewModel = ViewModelProviders.of(this).get(ShowStationStatusViewModel.class);

        recyclerView = findViewById(R.id.recyclerView_schedule);
        final TripstatusRecyclerAdapter adapter =
                new TripstatusRecyclerAdapter(viewModel.getTrips().getValue(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel.getTrips().observe(this, tripstatuses -> {


            if (tripstatuses == null) {
                Log.d(TAG, "Trips are null");
            } else {
                adapter.setTripstatusList(tripstatuses);

                for (Tripstatus tripstatus : tripstatuses
                ) {
                    Log.d(TAG, "Trip (Activity) : " + tripstatus.getTripNumber());
                }
            }

        });


    }

    public void refreshSchedule(View view) throws InterruptedException {
        btnGetSchedules.setEnabled(false);
        viewModel.getTripStatusForLineStation("09", "13");
        btnGetSchedules.setEnabled(true);

    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
