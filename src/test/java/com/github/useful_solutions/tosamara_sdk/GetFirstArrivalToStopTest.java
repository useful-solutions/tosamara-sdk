package com.github.useful_solutions.tosamara_sdk;

import com.github.useful_solutions.tosamara_sdk.api.APIRequest;
import com.github.useful_solutions.tosamara_sdk.api.APIRequestImpl;
import com.github.useful_solutions.tosamara_sdk.api.record.response.GetFirstArrivalToStopResponse;
import com.github.useful_solutions.tosamara_sdk.classifier.Classifiers;
import com.github.useful_solutions.tosamara_sdk.classifier.pojo.Stop;
import org.junit.jupiter.api.Assertions;

import java.util.List;

class GetFirstArrivalToStopTest {

    private static final APIRequest API_REQUEST = new APIRequestImpl();

    void forAllStopsTest() {
        try {
            List<Stop> stops = Classifiers.getStops();
            for (Stop stop : stops) {
                GetFirstArrivalToStopResponse getFirstArrivalToStopResponse = API_REQUEST.getFirstArrivalToStop(stop.ksId, Integer.MAX_VALUE);
                if (!getFirstArrivalToStopResponse.arrivalTransports.isEmpty()) {
                    getFirstArrivalToStopResponse.arrivalTransports.forEach(transport ->
                            System.out.println(
                                    "Остановка: " + stop.title + ", " +
                                            transport.number +
                                            "(" + transport.stateNumber + ")" + " -> " +
                                            transport.nextStopName +
                                            ", через " + transport.timeInSeconds + " сек."
                            )
                    );
                }
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

}
