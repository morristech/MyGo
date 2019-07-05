package com.danyos.mygo.ui.showstationstatus;

import android.content.Context;
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
        View view = inflater.inflate(R.layout.recyclerview_schedule_item, parent);
        TripstatusViewHolder viewHolder = new TripstatusViewHolder(view, this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TripstatusViewHolder holder, int position) {
        Tripstatus tripstatus = tripstatusList.get(position);
        holder.destination.setText(tripstatus.getDestination());
        holder.scheduled.setText(tripstatus.getScheduledTime());
        holder.stops.setText(tripstatus.getStoppingAtList().get(0).toString());
        holder.platform.setText(tripstatus.getTrack());
        holder.status.setText(tripstatus.getStatusTimeStamp());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
