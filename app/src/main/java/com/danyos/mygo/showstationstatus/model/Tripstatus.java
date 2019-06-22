package com.danyos.mygo.showstationstatus.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tripstatus {

    private Integer rowIndex;
    private String tripNumber;
    private String expected;
    private String extraRemark;
    private String direction;
    private String directionCd;
    private Integer directionIndex;
    private Object departTxt;
    private Object arriveTxt;
    private String detailTxt;
    private String scheduledTime;
    private Boolean hasActualTime;
    private Boolean isRunningTrip;
    private Integer delay;
    private Integer delaySec;
    private String delayDesc;
    private String arriveIn;
    private String serviceCd;
    private String stoppingAt;
    private Boolean stoppingAtIsCancelled;
    private String stopListString;
    private Object unionArrivePlatform;
    private Object unionDepartPlatform;
    private Object unionArrivalDepartureTime;
    private Boolean unionPlatformActualOverrided;
    private Boolean trackActualOverrided;
    private Integer stopAtIndex;
    private Boolean tripCancelled;
    private String estimatedArrival;
    private String statusTimeStamp;
    private Boolean onGridDisplayed;
    private List<StoppingAtList> stoppingAtList = null;
    private List<Object> messages = null;
    private List<Object> remarks = null;
    private List<StopsList> stopsList = null;
    private TrackAttr trackAttr;
    private String actual;
    private String scheduled;
    private String track;
    private Object tripName;
    private String destination;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Tripstatus() {
    }

    /**
     *
     * @param departTxt
     * @param serviceCd
     * @param unionArrivePlatform
     * @param stoppingAtList
     * @param tripNumber
     * @param direction
     * @param delaySec
     * @param tripCancelled
     * @param remarks
     * @param arriveTxt
     * @param messages
     * @param unionPlatformActualOverrided
     * @param tripName
     * @param directionCd
     * @param unionArrivalDepartureTime
     * @param detailTxt
     * @param isRunningTrip
     * @param stopListString
     * @param hasActualTime
     * @param scheduledTime
     * @param directionIndex
     * @param statusTimeStamp
     * @param stoppingAtIsCancelled
     * @param trackActualOverrided
     * @param track
     * @param delayDesc
     * @param arriveIn
     * @param stopAtIndex
     * @param destination
     * @param onGridDisplayed
     * @param extraRemark
     * @param scheduled
     * @param expected
     * @param stopsList
     * @param rowIndex
     * @param trackAttr
     * @param stoppingAt
     * @param unionDepartPlatform
     * @param actual
     * @param delay
     * @param estimatedArrival
     */
    public Tripstatus(Integer rowIndex, String tripNumber, String expected, String extraRemark, String direction, String directionCd, Integer directionIndex, Object departTxt, Object arriveTxt, String detailTxt, String scheduledTime, Boolean hasActualTime, Boolean isRunningTrip, Integer delay, Integer delaySec, String delayDesc, String arriveIn, String serviceCd, String stoppingAt, Boolean stoppingAtIsCancelled, String stopListString, Object unionArrivePlatform, Object unionDepartPlatform, Object unionArrivalDepartureTime, Boolean unionPlatformActualOverrided, Boolean trackActualOverrided, Integer stopAtIndex, Boolean tripCancelled, String estimatedArrival, String statusTimeStamp, Boolean onGridDisplayed, List<StoppingAtList> stoppingAtList, List<Object> messages, List<Object> remarks, List<StopsList> stopsList, TrackAttr trackAttr, String actual, String scheduled, String track, Object tripName, String destination) {
        super();
        this.rowIndex = rowIndex;
        this.tripNumber = tripNumber;
        this.expected = expected;
        this.extraRemark = extraRemark;
        this.direction = direction;
        this.directionCd = directionCd;
        this.directionIndex = directionIndex;
        this.departTxt = departTxt;
        this.arriveTxt = arriveTxt;
        this.detailTxt = detailTxt;
        this.scheduledTime = scheduledTime;
        this.hasActualTime = hasActualTime;
        this.isRunningTrip = isRunningTrip;
        this.delay = delay;
        this.delaySec = delaySec;
        this.delayDesc = delayDesc;
        this.arriveIn = arriveIn;
        this.serviceCd = serviceCd;
        this.stoppingAt = stoppingAt;
        this.stoppingAtIsCancelled = stoppingAtIsCancelled;
        this.stopListString = stopListString;
        this.unionArrivePlatform = unionArrivePlatform;
        this.unionDepartPlatform = unionDepartPlatform;
        this.unionArrivalDepartureTime = unionArrivalDepartureTime;
        this.unionPlatformActualOverrided = unionPlatformActualOverrided;
        this.trackActualOverrided = trackActualOverrided;
        this.stopAtIndex = stopAtIndex;
        this.tripCancelled = tripCancelled;
        this.estimatedArrival = estimatedArrival;
        this.statusTimeStamp = statusTimeStamp;
        this.onGridDisplayed = onGridDisplayed;
        this.stoppingAtList = stoppingAtList;
        this.messages = messages;
        this.remarks = remarks;
        this.stopsList = stopsList;
        this.trackAttr = trackAttr;
        this.actual = actual;
        this.scheduled = scheduled;
        this.track = track;
        this.tripName = tripName;
        this.destination = destination;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    public Tripstatus withRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public Tripstatus withTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
        return this;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public Tripstatus withExpected(String expected) {
        this.expected = expected;
        return this;
    }

    public String getExtraRemark() {
        return extraRemark;
    }

    public void setExtraRemark(String extraRemark) {
        this.extraRemark = extraRemark;
    }

    public Tripstatus withExtraRemark(String extraRemark) {
        this.extraRemark = extraRemark;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Tripstatus withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirectionCd() {
        return directionCd;
    }

    public void setDirectionCd(String directionCd) {
        this.directionCd = directionCd;
    }

    public Tripstatus withDirectionCd(String directionCd) {
        this.directionCd = directionCd;
        return this;
    }

    public Integer getDirectionIndex() {
        return directionIndex;
    }

    public void setDirectionIndex(Integer directionIndex) {
        this.directionIndex = directionIndex;
    }

    public Tripstatus withDirectionIndex(Integer directionIndex) {
        this.directionIndex = directionIndex;
        return this;
    }

    public Object getDepartTxt() {
        return departTxt;
    }

    public void setDepartTxt(Object departTxt) {
        this.departTxt = departTxt;
    }

    public Tripstatus withDepartTxt(Object departTxt) {
        this.departTxt = departTxt;
        return this;
    }

    public Object getArriveTxt() {
        return arriveTxt;
    }

    public void setArriveTxt(Object arriveTxt) {
        this.arriveTxt = arriveTxt;
    }

    public Tripstatus withArriveTxt(Object arriveTxt) {
        this.arriveTxt = arriveTxt;
        return this;
    }

    public String getDetailTxt() {
        return detailTxt;
    }

    public void setDetailTxt(String detailTxt) {
        this.detailTxt = detailTxt;
    }

    public Tripstatus withDetailTxt(String detailTxt) {
        this.detailTxt = detailTxt;
        return this;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Tripstatus withScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    public Boolean getHasActualTime() {
        return hasActualTime;
    }

    public void setHasActualTime(Boolean hasActualTime) {
        this.hasActualTime = hasActualTime;
    }

    public Tripstatus withHasActualTime(Boolean hasActualTime) {
        this.hasActualTime = hasActualTime;
        return this;
    }

    public Boolean getIsRunningTrip() {
        return isRunningTrip;
    }

    public void setIsRunningTrip(Boolean isRunningTrip) {
        this.isRunningTrip = isRunningTrip;
    }

    public Tripstatus withIsRunningTrip(Boolean isRunningTrip) {
        this.isRunningTrip = isRunningTrip;
        return this;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Tripstatus withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public Integer getDelaySec() {
        return delaySec;
    }

    public void setDelaySec(Integer delaySec) {
        this.delaySec = delaySec;
    }

    public Tripstatus withDelaySec(Integer delaySec) {
        this.delaySec = delaySec;
        return this;
    }

    public String getDelayDesc() {
        return delayDesc;
    }

    public void setDelayDesc(String delayDesc) {
        this.delayDesc = delayDesc;
    }

    public Tripstatus withDelayDesc(String delayDesc) {
        this.delayDesc = delayDesc;
        return this;
    }

    public String getArriveIn() {
        return arriveIn;
    }

    public void setArriveIn(String arriveIn) {
        this.arriveIn = arriveIn;
    }

    public Tripstatus withArriveIn(String arriveIn) {
        this.arriveIn = arriveIn;
        return this;
    }

    public String getServiceCd() {
        return serviceCd;
    }

    public void setServiceCd(String serviceCd) {
        this.serviceCd = serviceCd;
    }

    public Tripstatus withServiceCd(String serviceCd) {
        this.serviceCd = serviceCd;
        return this;
    }

    public String getStoppingAt() {
        return stoppingAt;
    }

    public void setStoppingAt(String stoppingAt) {
        this.stoppingAt = stoppingAt;
    }

    public Tripstatus withStoppingAt(String stoppingAt) {
        this.stoppingAt = stoppingAt;
        return this;
    }

    public Boolean getStoppingAtIsCancelled() {
        return stoppingAtIsCancelled;
    }

    public void setStoppingAtIsCancelled(Boolean stoppingAtIsCancelled) {
        this.stoppingAtIsCancelled = stoppingAtIsCancelled;
    }

    public Tripstatus withStoppingAtIsCancelled(Boolean stoppingAtIsCancelled) {
        this.stoppingAtIsCancelled = stoppingAtIsCancelled;
        return this;
    }

    public String getStopListString() {
        return stopListString;
    }

    public void setStopListString(String stopListString) {
        this.stopListString = stopListString;
    }

    public Tripstatus withStopListString(String stopListString) {
        this.stopListString = stopListString;
        return this;
    }

    public Object getUnionArrivePlatform() {
        return unionArrivePlatform;
    }

    public void setUnionArrivePlatform(Object unionArrivePlatform) {
        this.unionArrivePlatform = unionArrivePlatform;
    }

    public Tripstatus withUnionArrivePlatform(Object unionArrivePlatform) {
        this.unionArrivePlatform = unionArrivePlatform;
        return this;
    }

    public Object getUnionDepartPlatform() {
        return unionDepartPlatform;
    }

    public void setUnionDepartPlatform(Object unionDepartPlatform) {
        this.unionDepartPlatform = unionDepartPlatform;
    }

    public Tripstatus withUnionDepartPlatform(Object unionDepartPlatform) {
        this.unionDepartPlatform = unionDepartPlatform;
        return this;
    }

    public Object getUnionArrivalDepartureTime() {
        return unionArrivalDepartureTime;
    }

    public void setUnionArrivalDepartureTime(Object unionArrivalDepartureTime) {
        this.unionArrivalDepartureTime = unionArrivalDepartureTime;
    }

    public Tripstatus withUnionArrivalDepartureTime(Object unionArrivalDepartureTime) {
        this.unionArrivalDepartureTime = unionArrivalDepartureTime;
        return this;
    }

    public Boolean getUnionPlatformActualOverrided() {
        return unionPlatformActualOverrided;
    }

    public void setUnionPlatformActualOverrided(Boolean unionPlatformActualOverrided) {
        this.unionPlatformActualOverrided = unionPlatformActualOverrided;
    }

    public Tripstatus withUnionPlatformActualOverrided(Boolean unionPlatformActualOverrided) {
        this.unionPlatformActualOverrided = unionPlatformActualOverrided;
        return this;
    }

    public Boolean getTrackActualOverrided() {
        return trackActualOverrided;
    }

    public void setTrackActualOverrided(Boolean trackActualOverrided) {
        this.trackActualOverrided = trackActualOverrided;
    }

    public Tripstatus withTrackActualOverrided(Boolean trackActualOverrided) {
        this.trackActualOverrided = trackActualOverrided;
        return this;
    }

    public Integer getStopAtIndex() {
        return stopAtIndex;
    }

    public void setStopAtIndex(Integer stopAtIndex) {
        this.stopAtIndex = stopAtIndex;
    }

    public Tripstatus withStopAtIndex(Integer stopAtIndex) {
        this.stopAtIndex = stopAtIndex;
        return this;
    }

    public Boolean getTripCancelled() {
        return tripCancelled;
    }

    public void setTripCancelled(Boolean tripCancelled) {
        this.tripCancelled = tripCancelled;
    }

    public Tripstatus withTripCancelled(Boolean tripCancelled) {
        this.tripCancelled = tripCancelled;
        return this;
    }

    public String getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public Tripstatus withEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
        return this;
    }

    public String getStatusTimeStamp() {
        return statusTimeStamp;
    }

    public void setStatusTimeStamp(String statusTimeStamp) {
        this.statusTimeStamp = statusTimeStamp;
    }

    public Tripstatus withStatusTimeStamp(String statusTimeStamp) {
        this.statusTimeStamp = statusTimeStamp;
        return this;
    }

    public Boolean getOnGridDisplayed() {
        return onGridDisplayed;
    }

    public void setOnGridDisplayed(Boolean onGridDisplayed) {
        this.onGridDisplayed = onGridDisplayed;
    }

    public Tripstatus withOnGridDisplayed(Boolean onGridDisplayed) {
        this.onGridDisplayed = onGridDisplayed;
        return this;
    }

    public List<StoppingAtList> getStoppingAtList() {
        return stoppingAtList;
    }

    public void setStoppingAtList(List<StoppingAtList> stoppingAtList) {
        this.stoppingAtList = stoppingAtList;
    }

    public Tripstatus withStoppingAtList(List<StoppingAtList> stoppingAtList) {
        this.stoppingAtList = stoppingAtList;
        return this;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public Tripstatus withMessages(List<Object> messages) {
        this.messages = messages;
        return this;
    }

    public List<Object> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Object> remarks) {
        this.remarks = remarks;
    }

    public Tripstatus withRemarks(List<Object> remarks) {
        this.remarks = remarks;
        return this;
    }

    public List<StopsList> getStopsList() {
        return stopsList;
    }

    public void setStopsList(List<StopsList> stopsList) {
        this.stopsList = stopsList;
    }

    public Tripstatus withStopsList(List<StopsList> stopsList) {
        this.stopsList = stopsList;
        return this;
    }

    public TrackAttr getTrackAttr() {
        return trackAttr;
    }

    public void setTrackAttr(TrackAttr trackAttr) {
        this.trackAttr = trackAttr;
    }

    public Tripstatus withTrackAttr(TrackAttr trackAttr) {
        this.trackAttr = trackAttr;
        return this;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public Tripstatus withActual(String actual) {
        this.actual = actual;
        return this;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public Tripstatus withScheduled(String scheduled) {
        this.scheduled = scheduled;
        return this;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public Tripstatus withTrack(String track) {
        this.track = track;
        return this;
    }

    public Object getTripName() {
        return tripName;
    }

    public void setTripName(Object tripName) {
        this.tripName = tripName;
    }

    public Tripstatus withTripName(Object tripName) {
        this.tripName = tripName;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Tripstatus withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Tripstatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
