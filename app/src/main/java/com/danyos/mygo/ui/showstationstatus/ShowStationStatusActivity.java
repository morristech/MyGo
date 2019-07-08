package com.danyos.mygo.ui.showstationstatus;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.danyos.mygo.R;
import com.danyos.mygo.data.TripStatusDataSource;


public class ShowStationStatusActivity extends AppCompatActivity {

    private ProgressBar progressBar;
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
        progressBar = findViewById(R.id.progressBar_loading);
        progressBar.setVisibility(View.VISIBLE);

        btnGetSchedules = findViewById(R.id.button_getSchedules);

        viewModel = ViewModelProviders.of(this).get(ShowStationStatusViewModel.class);

        recyclerView = findViewById(R.id.recyclerView_schedule);
        final TripstatusRecyclerAdapter adapter =
                new TripstatusRecyclerAdapter(viewModel.getTrips().getValue(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel.getTrips().observe(this, tripstatuses -> {

            viewModel.getViewState().setValue(ShowStationStatusViewModel.ViewState.COMPLETE);
            Log.d(TAG, "Updated!");

//            progressBar.setVisibility(View.GONE);
            if (tripstatuses == null) {
                Log.d(TAG, "Trips are null");
            } else {
                adapter.setTripstatusList(tripstatuses);
//
//                for (Tripstatus tripstatus : tripstatuses
//                ) {
//                    Log.d(TAG, "Trip (Activity) : " + tripstatus.getTripNumber());
//                }
            }

        });

        viewModel.getViewState().observe(this, new Observer<ShowStationStatusViewModel.ViewState>() {
            @Override
            public void onChanged(ShowStationStatusViewModel.ViewState viewState) {
                if (viewState != null) {
                    switch (viewState) {
                        case LOADING:
                            btnGetSchedules.setEnabled(false);
                            progressBar.setVisibility(View.VISIBLE);
                            break;
                        case COMPLETE:
                            progressBar.postInvalidate();
                            btnGetSchedules.setEnabled(true);
                            break;
                    }
                }
            }
        });


    }

    public void refreshSchedule(View view) throws InterruptedException {
        viewModel.getTripStatusForLineStation("09", "13");
    }


    @Override
    protected void onStop() {
        super.onStop();
    }
}
