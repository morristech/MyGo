package com.danyos.mygo.showstationstatus.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopsList {

    private List<Object> statusText = null;
    private String statusCode;
    private String stopCode;
    private String stopName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public StopsList() {
    }

    /**
     *
     * @param statusCode
     * @param stopName
     * @param statusText
     * @param stopCode
     */
    public StopsList(List<Object> statusText, String statusCode, String stopCode, String stopName) {
        super();
        this.statusText = statusText;
        this.statusCode = statusCode;
        this.stopCode = stopCode;
        this.stopName = stopName;
    }

    public List<Object> getStatusText() {
        return statusText;
    }

    public void setStatusText(List<Object> statusText) {
        this.statusText = statusText;
    }

    public StopsList withStatusText(List<Object> statusText) {
        this.statusText = statusText;
        return this;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public StopsList withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public StopsList withStopCode(String stopCode) {
        this.stopCode = stopCode;
        return this;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public StopsList withStopName(String stopName) {
        this.stopName = stopName;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StopsList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
