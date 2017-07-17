package com.revengemission.schedule.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by zhang wanchao on 17-3-31.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
public class ResponseMessage implements Serializable{

    protected String responseCode;
    //@JsonIgnore
    protected Object responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Object getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(Object responseMessage) {
        this.responseMessage = responseMessage;
    }
}
