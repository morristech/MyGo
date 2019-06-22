package com.danyos.mygo.showstationstatus.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Station {

    private List<Tripstatus> tripStatus = null;
    private List<S4Message> s4Messages = null;
    private Object messages;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Station() {
    }

    /**
     *
     * @param s4Messages
     * @param tripStatus
     * @param messages
     */
    public Station(List<Tripstatus> tripStatus, List<S4Message> s4Messages, Object messages) {
        super();
        this.tripStatus = tripStatus;
        this.s4Messages = s4Messages;
        this.messages = messages;
    }

    public List<Tripstatus> getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(List<Tripstatus> tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Station withTripStatus(List<Tripstatus> tripStatus) {
        this.tripStatus = tripStatus;
        return this;
    }

    public List<S4Message> getS4Messages() {
        return s4Messages;
    }

    public void setS4Messages(List<S4Message> s4Messages) {
        this.s4Messages = s4Messages;
    }

    public Station withS4Messages(List<S4Message> s4Messages) {
        this.s4Messages = s4Messages;
        return this;
    }

    public Object getMessages() {
        return messages;
    }

    public void setMessages(Object messages) {
        this.messages = messages;
    }

    public Station withMessages(Object messages) {
        this.messages = messages;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Station withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
