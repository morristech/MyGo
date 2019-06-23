package com.danyos.mygo.showstationstatus.model;

import com.squareup.moshi.Json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopsList {

    @Json(name = "StatusText")
    private List<Object> statusText = null;
    @Json(name = "StatusCode")
    private String statusCode;
    @Json(name = "StopCode")
    private String stopCode;
    @Json(name = "StopName")
    private String stopName;

    public List<Object> getStatusText() {
        return statusText;
    }

    public void setStatusText(List<Object> statusText) {
        this.statusText = statusText;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }


}
