package api.record.response;

import api.record.pojo.Message;
import api.record.pojo.ArrivalTransport;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetRouteArrivalToStopResponse {

    @JsonProperty(value = "arrival")
    public List<ArrivalTransport> arrivalTransports;

    @JsonProperty(value = "messages")
    public List<Message> messages;

}