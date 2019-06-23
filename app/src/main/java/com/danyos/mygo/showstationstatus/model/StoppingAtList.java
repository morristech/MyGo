package com.danyos.mygo.showstationstatus.model;

import com.squareup.moshi.Json;


public class StoppingAtList {

        @Json(name = "StopDisplay")
        private String stopDisplay;
        @Json(name = "IsCancelled")
        private Boolean isCancelled;

        public String getStopDisplay() {
            return stopDisplay;
        }

        public void setStopDisplay(String stopDisplay) {
            this.stopDisplay = stopDisplay;
        }

        public Boolean getIsCancelled() {
            return isCancelled;
        }

        public void setIsCancelled(Boolean isCancelled) {
            this.isCancelled = isCancelled;
        }


}
