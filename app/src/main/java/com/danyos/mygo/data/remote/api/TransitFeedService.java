package com.danyos.mygo.data.remote.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TransitFeedService {

    String BASE_URL = "http://gotracker.ca/GOTracker/web/GODataAPIProxy.svc/";

    @GET("StationStatusJSON/Service/StationCd/Lang/{serviceCd}/{stationCd}/en-US")
    Call<String> listTrips(
            @Path("serviceCd") String serviceCd,
            @Path("stationCd") String stationCd);
}
