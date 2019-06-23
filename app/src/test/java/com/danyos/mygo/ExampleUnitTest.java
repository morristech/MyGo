package com.danyos.mygo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    private static final String TAG = "MyGO";
    private final String service = "09";
    private final String stationCd = "13";

    private final String endpoint =
            "http://gotracker.ca/GOTracker/web/GODataAPIProxy.svc/StationStatusJSON/Service/StationCd/Lang/{0}/{1}/en-US";



    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}