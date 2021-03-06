package com.github.useful_solutions.tosamara_sdk.api.record.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.useful_solutions.tosamara_sdk.api.record.pojo.GeoPoint;
import com.github.useful_solutions.tosamara_sdk.api.record.pojo.Message;

public class VoteForMessageRequest {

    @JsonProperty
    private final String method = "voteForMessage";

    @JsonProperty(value = "ID")
    private final Integer id;

    @JsonProperty(value = "VOTE")
    private final Message.Vote vote;

    @JsonProperty(value = "LATITUDE")
    private final Double latitude;

    @JsonProperty(value = "LONGITUDE")
    private final Double longitude;

    @JsonProperty(value = "DEVICEID")
    private final String deviceId;


    public VoteForMessageRequest(Integer id, Message.Vote vote, GeoPoint geoPoint, String deviceId) {
        this.id = id;
        this.vote = vote;
        this.latitude = geoPoint.latitude;
        this.longitude = geoPoint.longitude;
        this.deviceId = deviceId;
    }

    public Integer getId() {
        return id;
    }

    public Message.Vote getVote() {
        return vote;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
