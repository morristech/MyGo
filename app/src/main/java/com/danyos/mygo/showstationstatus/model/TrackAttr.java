package com.danyos.mygo.showstationstatus.model;

import com.squareup.moshi.Json;

import java.util.HashMap;
import java.util.Map;

public class TrackAttr {

    @Json(name = "Background")
    private Object background;
    @Json(name = "Foreground")
    private Object foreground;
    @Json(name = "Blink")
    private Boolean blink;
    @Json(name = "Bold")
    private Boolean bold;
    @Json(name = "Italics")
    private Boolean italics;
    @Json(name = "Underline")
    private Boolean underline;

    public Object getBackground() {
        return background;
    }

    public void setBackground(Object background) {
        this.background = background;
    }

    public Object getForeground() {
        return foreground;
    }

    public void setForeground(Object foreground) {
        this.foreground = foreground;
    }

    public Boolean getBlink() {
        return blink;
    }

    public void setBlink(Boolean blink) {
        this.blink = blink;
    }

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Boolean getItalics() {
        return italics;
    }

    public void setItalics(Boolean italics) {
        this.italics = italics;
    }

    public Boolean getUnderline() {
        return underline;
    }

    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }
}
