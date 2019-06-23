package com.danyos.mygo;

import com.danyos.mygo.util.TransitFeedTask;

import org.junit.Test;

import java.text.MessageFormat;

public class TransitFeedTaskTest {




    private static final String TAG = "MyGO";
    private final String service = "09";
    private final String stationCd = "13";

    private final String endpoint =
            "http://gotracker.ca/GOTracker/web/GODataAPIProxy.svc/StationStatusJSON/Service/StationCd/Lang/{0}/{1}/en-US";

    @Test
    public void getFeed() {

        String urlString = MessageFormat.format(
                endpoint,
                service,
                stationCd
        );

        //Log.d(TAG, "URL: " + urlString);

        TransitFeedTask task = new TransitFeedTask();
        task.execute(urlString);
    }
}
