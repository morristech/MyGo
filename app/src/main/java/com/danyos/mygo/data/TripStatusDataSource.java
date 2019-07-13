package com.danyos.mygo.data;

import com.danyos.mygo.domain.Tripstatus;

import java.util.List;

public interface TripStatusDataSource {

    List<Tripstatus> getTripStatus(String linecd, String stationCd);


}
