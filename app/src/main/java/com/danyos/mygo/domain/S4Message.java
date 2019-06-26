package com.danyos.mygo.domain;

import java.util.HashMap;
import java.util.Map;

public class S4Message {

    private String msgCategory;
    private String msgText;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public S4Message() {
    }

    /**
     *
     * @param msgText
     * @param msgCategory
     */
    public S4Message(String msgCategory, String msgText) {
        super();
        this.msgCategory = msgCategory;
        this.msgText = msgText;
    }

    public String getMsgCategory() {
        return msgCategory;
    }

    public void setMsgCategory(String msgCategory) {
        this.msgCategory = msgCategory;
    }

    public S4Message withMsgCategory(String msgCategory) {
        this.msgCategory = msgCategory;
        return this;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public S4Message withMsgText(String msgText) {
        this.msgText = msgText;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public S4Message withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
