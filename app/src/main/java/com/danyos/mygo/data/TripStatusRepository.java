package com.danyos.mygo.data;

public class TripStatusRepository {

    private TripStatusDataSource tripStatusDataSource;

    public TripStatusRepository(TripStatusDataSource tripStatusDataSource) {
        this.tripStatusDataSource = tripStatusDataSource;
    }

    private String getTripStatus(String lineCd, String stationCd) {
        return tripStatusDataSource.getTripStatus(lineCd, stationCd);
    }

}
