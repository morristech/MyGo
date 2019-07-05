package com.danyos.mygo.ui.showstationstatus;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.danyos.mygo.R;

public class TripstatusViewHolder extends RecyclerView.ViewHolder {


    private TripstatusRecyclerAdapter adapter;
    TextView destination, scheduled, stops, platform, status;

    public TripstatusViewHolder(@NonNull View itemView, TripstatusRecyclerAdapter adapter) {
        super(itemView);
        destination = itemView.findViewById(R.id.textView_destination);
        scheduled = itemView.findViewById(R.id.textView_scheduled);
        stops = itemView.findViewById(R.id.textView_stops);
        platform = itemView.findViewById(R.id.textView_platform);
        status = itemView.findViewById(R.id.textView_status);
        this.adapter = adapter;
    }
}
