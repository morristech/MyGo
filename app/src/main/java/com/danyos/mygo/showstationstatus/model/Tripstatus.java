package com.danyos.mygo.showstationstatus.model;

import com.squareup.moshi.Json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tripstatus {

    @Json(name = "RowIndex")
    private Integer rowIndex;
    @Json(name = "TripNumber")
    private String tripNumber;
    @Json(name = "Expected")
    private String expected;
    @Json(name = "ExtraRemark")
    private String extraRemark;
    @Json(name = "Direction")
    private String direction;
    @Json(name = "DirectionCd")
    private String directionCd;
    @Json(name = "DirectionIndex")
    private Integer directionIndex;
    @Json(name = "DepartTxt")
    private Object departTxt;
    @Json(name = "ArriveTxt")
    private Object arriveTxt;
    @Json(name = "DetailTxt")
    private String detailTxt;
    @Json(name = "ScheduledTime")
    private String scheduledTime;
    @Json(name = "HasActualTime")
    private Boolean hasActualTime;
    @Json(name = "IsRunningTrip")
    private Boolean isRunningTrip;
    @Json(name = "Delay")
    private Integer delay;
    @Json(name = "DelaySec")
    private Integer delaySec;
    @Json(name = "DelayDesc")
    private String delayDesc;
    @Json(name = "ArriveIn")
    private String arriveIn;
    @Json(name = "ServiceCd")
    private String serviceCd;
    @Json(name = "StoppingAt")
    private String stoppingAt;
    @Json(name = "StoppingAtIsCancelled")
    private Boolean stoppingAtIsCancelled;
    @Json(name = "StopListString")
    private String stopListString;
    @Json(name = "UnionArrivePlatform")
    private Object unionArrivePlatform;
    @Json(name = "UnionDepartPlatform")
    private Object unionDepartPlatform;
    @Json(name = "UnionArrivalDepartureTime")
    private Object unionArrivalDepartureTime;
    @Json(name = "UnionPlatformActualOverrided")
    private Boolean unionPlatformActualOverrided;
    @Json(name = "TrackActualOverrided")
    private Boolean trackActualOverrided;
    @Json(name = "StopAtIndex")
    private Integer stopAtIndex;
    @Json(name = "TripCancelled")
    private Boolean tripCancelled;
    @Json(name = "EstimatedArrival")
    private String estimatedArrival;
    @Json(name = "StatusTimeStamp")
    private String statusTimeStamp;
    @Json(name = "OnGridDisplayed")
    private Boolean onGridDisplayed;
    @Json(name = "StoppingAtList")
    private List<StoppingAtList> stoppingAtList = null;
    @Json(name = "Messages")
    private List<Object> messages = null;
    @Json(name = "Remarks")
    private List<Object> remarks = null;
    @Json(name = "StopsList")
    private List<StopsList> stopsList = null;
    @Json(name = "TrackAttr")
    private TrackAttr trackAttr;
    @Json(name = "Actual")
    private String actual;
    @Json(name = "Scheduled")
    private String scheduled;
    @Json(name = "Track")
    private String track;
    @Json(name = "TripName")
    private String tripName;
    @Json(name = "Destination")
    private String destination;

    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getExtraRemark() {
        return extraRemark;
    }

    public void setExtraRemark(String extraRemark) {
        this.extraRemark = extraRemark;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirectionCd() {
        return directionCd;
    }

    public void setDirectionCd(String directionCd) {
        this.directionCd = directionCd;
    }

    public Integer getDirectionIndex() {
        return directionIndex;
    }

    public void setDirectionIndex(Integer directionIndex) {
        this.directionIndex = directionIndex;
    }

    public Object getDepartTxt() {
        return departTxt;
    }

    public void setDepartTxt(Object departTxt) {
        this.departTxt = departTxt;
    }

    public Object getArriveTxt() {
        return arriveTxt;
    }

    public void setArriveTxt(Object arriveTxt) {
        this.arriveTxt = arriveTxt;
    }

    public String getDetailTxt() {
        return detailTxt;
    }

    public void setDetailTxt(String detailTxt) {
        this.detailTxt = detailTxt;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Boolean getHasActualTime() {
        return hasActualTime;
    }

    public void setHasActualTime(Boolean hasActualTime) {
        this.hasActualTime = hasActualTime;
    }

    public Boolean getIsRunningTrip() {
        return isRunningTrip;
    }

    public void setIsRunningTrip(Boolean isRunningTrip) {
        this.isRunningTrip = isRunningTrip;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Integer getDelaySec() {
        return delaySec;
    }

    public void setDelaySec(Integer delaySec) {
        this.delaySec = delaySec;
    }

    public String getDelayDesc() {
        return delayDesc;
    }

    public void setDelayDesc(String delayDesc) {
        this.delayDesc = delayDesc;
    }

    public String getArriveIn() {
        return arriveIn;
    }

    public void setArriveIn(String arriveIn) {
        this.arriveIn = arriveIn;
    }

    public String getServiceCd() {
        return serviceCd;
    }

    public void setServiceCd(String serviceCd) {
        this.serviceCd = serviceCd;
    }

    public String getStoppingAt() {
        return stoppingAt;
    }

    public void setStoppingAt(String stoppingAt) {
        this.stoppingAt = stoppingAt;
    }

    public Boolean getStoppingAtIsCancelled() {
        return stoppingAtIsCancelled;
    }

    public void setStoppingAtIsCancelled(Boolean stoppingAtIsCancelled) {
        this.stoppingAtIsCancelled = stoppingAtIsCancelled;
    }

    public String getStopListString() {
        return stopListString;
    }

    public void setStopListString(String stopListString) {
        this.stopListString = stopListString;
    }

    public Object getUnionArrivePlatform() {
        return unionArrivePlatform;
    }

    public void setUnionArrivePlatform(Object unionArrivePlatform) {
        this.unionArrivePlatform = unionArrivePlatform;
    }

    public Object getUnionDepartPlatform() {
        return unionDepartPlatform;
    }

    public void setUnionDepartPlatform(Object unionDepartPlatform) {
        this.unionDepartPlatform = unionDepartPlatform;
    }

    public Object getUnionArrivalDepartureTime() {
        return unionArrivalDepartureTime;
    }

    public void setUnionArrivalDepartureTime(Object unionArrivalDepartureTime) {
        this.unionArrivalDepartureTime = unionArrivalDepartureTime;
    }

    public Boolean getUnionPlatformActualOverrided() {
        return unionPlatformActualOverrided;
    }

    public void setUnionPlatformActualOverrided(Boolean unionPlatformActualOverrided) {
        this.unionPlatformActualOverrided = unionPlatformActualOverrided;
    }

    public Boolean getTrackActualOverrided() {
        return trackActualOverrided;
    }

    public void setTrackActualOverrided(Boolean trackActualOverrided) {
        this.trackActualOverrided = trackActualOverrided;
    }

    public Integer getStopAtIndex() {
        return stopAtIndex;
    }

    public void setStopAtIndex(Integer stopAtIndex) {
        this.stopAtIndex = stopAtIndex;
    }

    public Boolean getTripCancelled() {
        return tripCancelled;
    }

    public void setTripCancelled(Boolean tripCancelled) {
        this.tripCancelled = tripCancelled;
    }

    public String getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public String getStatusTimeStamp() {
        return statusTimeStamp;
    }

    public void setStatusTimeStamp(String statusTimeStamp) {
        this.statusTimeStamp = statusTimeStamp;
    }

    public Boolean getOnGridDisplayed() {
        return onGridDisplayed;
    }

    public void setOnGridDisplayed(Boolean onGridDisplayed) {
        this.onGridDisplayed = onGridDisplayed;
    }

    public List<StoppingAtList> getStoppingAtList() {
        return stoppingAtList;
    }

    public void setStoppingAtList(List<StoppingAtList> stoppingAtList) {
        this.stoppingAtList = stoppingAtList;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public List<Object> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Object> remarks) {
        this.remarks = remarks;
    }

    public List<StopsList> getStopsList() {
        return stopsList;
    }

    public void setStopsList(List<StopsList> stopsList) {
        this.stopsList = stopsList;
    }

    public TrackAttr getTrackAttr() {
        return trackAttr;
    }

    public void setTrackAttr(TrackAttr trackAttr) {
        this.trackAttr = trackAttr;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
