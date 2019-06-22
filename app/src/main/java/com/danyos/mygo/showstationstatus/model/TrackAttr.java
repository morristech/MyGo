package com.danyos.mygo.showstationstatus.model;

import java.util.HashMap;
import java.util.Map;

public class TrackAttr {

    private Object background;
    private Object foreground;
    private Boolean blink;
    private Boolean bold;
    private Boolean italics;
    private Boolean underline;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public TrackAttr() {
    }

    /**
     *
     * @param bold
     * @param italics
     * @param blink
     * @param underline
     * @param background
     * @param foreground
     */
    public TrackAttr(Object background, Object foreground, Boolean blink, Boolean bold, Boolean italics, Boolean underline) {
        super();
        this.background = background;
        this.foreground = foreground;
        this.blink = blink;
        this.bold = bold;
        this.italics = italics;
        this.underline = underline;
    }

    public Object getBackground() {
        return background;
    }

    public void setBackground(Object background) {
        this.background = background;
    }

    public TrackAttr withBackground(Object background) {
        this.background = background;
        return this;
    }

    public Object getForeground() {
        return foreground;
    }

    public void setForeground(Object foreground) {
        this.foreground = foreground;
    }

    public TrackAttr withForeground(Object foreground) {
        this.foreground = foreground;
        return this;
    }

    public Boolean getBlink() {
        return blink;
    }

    public void setBlink(Boolean blink) {
        this.blink = blink;
    }

    public TrackAttr withBlink(Boolean blink) {
        this.blink = blink;
        return this;
    }

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public TrackAttr withBold(Boolean bold) {
        this.bold = bold;
        return this;
    }

    public Boolean getItalics() {
        return italics;
    }

    public void setItalics(Boolean italics) {
        this.italics = italics;
    }

    public TrackAttr withItalics(Boolean italics) {
        this.italics = italics;
        return this;
    }

    public Boolean getUnderline() {
        return underline;
    }

    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }

    public TrackAttr withUnderline(Boolean underline) {
        this.underline = underline;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TrackAttr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
