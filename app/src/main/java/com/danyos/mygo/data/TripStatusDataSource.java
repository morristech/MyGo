package com.danyos.mygo.data;

import androidx.lifecycle.LiveData;

import com.danyos.mygo.domain.Tripstatus;

import java.util.List;

public interface TripStatusDataSource {

    LiveData<List<Tripstatus>> getTripStatus(String linecd, String stationCd);


}
