package com.danyos.mygo.util;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import com.danyos.mygo.data.TripStatusDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

public class TransitFeedTask extends AsyncTask<String, Void, String> {

    private WeakReference<ProgressBar> progressBar;
    private TripStatusDataSource dataSource;
    private static final String TAG = "MyGO";
    public interface AsyncResponse {
        void processFinish(String output);
    }

    public AsyncResponse delegate = null;

    public TransitFeedTask(AsyncResponse delegate,
                           ProgressBar progressBar,
                           TripStatusDataSource dataSource) {
        this.delegate = delegate;
        this.progressBar = new WeakReference<>(progressBar);
        this.dataSource = dataSource;
    }

    @Override
    protected String doInBackground(String... strings) {
        progressBar.get().setVisibility(View.VISIBLE);
        progressBar.get().animate();
        return null;
    }

    @Override
    protected void onPostExecute(String s) {

        progressBar.get().invalidate();

        delegate.processFinish(s);

//        super.onPostExecute(s);
//        Log.d(TAG, "Response: \n" + s.substring(0,100));

    }

    public String isToString(InputStream is) {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = null;
        try {
            in = new InputStreamReader(is, StandardCharsets.UTF_8);

            for (; ; ) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0)
                    break;
                out.append(buffer, 0, rsz);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return out.toString();
    }
}
