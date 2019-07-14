package com.danyos.mygo.ui.showstationstatus;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.danyos.mygo.R;
import com.danyos.mygo.domain.Tripstatus;

import java.util.List;

public class TripstatusRecyclerAdapter extends RecyclerView.Adapter<TripstatusViewHolder> {

    private List<Tripstatus> tripstatusList;
    private LayoutInflater inflater;

    public TripstatusRecyclerAdapter(List<Tripstatus> tripstatusList, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.tripstatusList = tripstatusList;
    }

    @NonNull
    @Override
    public TripstatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_schedule_item, parent, false);
        TripstatusViewHolder viewHolder = new TripstatusViewHolder(view, this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TripstatusViewHolder holder, int position) {

        String time = tripstatusList.get(position).getStatusTimeStamp().substring(10, 17);

        Tripstatus tripstatus = tripstatusList.get(position);
        holder.destination.setText(tripstatus.getDestination());
        holder.scheduled.setText(tripstatus.getScheduledTime());
        holder.stops.setText(tripstatus.getStoppingAt());
        holder.platform.setText(tripstatus.getTrack());
        holder.status.setText(tripstatus.getExpected());


    }

    @Override
    public int getItemCount() {
        if (tripstatusList != null)
            return tripstatusList.size();
        else
            return 0;
    }

    public void setTripstatusList(List<Tripstatus> tripstatusList) {
        Log.d(ShowStationStatusActivity.TAG, "Setting adapter with list size: " + tripstatusList.size());
        this.tripstatusList = tripstatusList;
        notifyDataSetChanged();
    }

    public void clear() {
        if (tripstatusList != null) {
            int size = tripstatusList.size();
            if (size != 0) {
                tripstatusList.clear();
                notifyItemRangeRemoved(0, size);
            }
        }
    }

}
