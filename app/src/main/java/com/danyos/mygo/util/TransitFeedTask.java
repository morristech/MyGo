package com.danyos.mygo.util;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TransitFeedTask extends AsyncTask<String, Void, String> {

    private static final String TAG = "MyGO";

    public interface AsyncResponse {
        void processFinish(String output);
    }

    public AsyncResponse delegate = null;

    public TransitFeedTask(AsyncResponse delegate) {
        this.delegate = delegate;
    }

    @Override
    protected String doInBackground(String... strings) {


//        if (strings.length == 0 ) {
//            Log.d(TAG, "Empty input");
//        }
//
//        URL url = null;
//        String response = null;
//        try {
//            url = new URL(strings[0]);
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
//            response = isToString(in);
//
//        } catch (MalformedURLException e) {
//            Log.e(TAG, "Bad Url", e );
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(strings[0])
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
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
