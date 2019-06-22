package com.danyos.mygo.showstationstatus.model;

import java.util.HashMap;
import java.util.Map;

public class StoppingAtList {

    private String stopDisplay;
    private Boolean isCancelled;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public StoppingAtList() {
    }

    /**
     *
     * @param stopDisplay
     * @param isCancelled
     */
    public StoppingAtList(String stopDisplay, Boolean isCancelled) {
        super();
        this.stopDisplay = stopDisplay;
        this.isCancelled = isCancelled;
    }

    public String getStopDisplay() {
        return stopDisplay;
    }

    public void setStopDisplay(String stopDisplay) {
        this.stopDisplay = stopDisplay;
    }

    public StoppingAtList withStopDisplay(String stopDisplay) {
        this.stopDisplay = stopDisplay;
        return this;
    }

    public Boolean getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public StoppingAtList withIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StoppingAtList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
