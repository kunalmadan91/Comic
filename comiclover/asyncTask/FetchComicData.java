package com.kunalmadan.android.comiclover.asyncTask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kunalmadan.android.comiclover.comicdata.ComicData;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KUNAL on 02-09-2016.
 */
public class FetchComicData extends AsyncTask<String,Void,String> {
    private ProgressDialog progressDialog;
    private Context mContext;
    private static final String LOG_TAG = FetchComicData.class.getSimpleName();
    public static List<String> description;

    public FetchComicData(Context context) {
        mContext = context;
    }




    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = new ProgressDialog(mContext);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);
        progressDialog.show();

    }

    @Override
    protected String doInBackground(String... params) {
        String idhero = params[0];

        String url = "http://gateway.marvel.com:80/v1/public/characters/"+idhero+"/comics?ts=1&apikey=3b9f480b29e4101e40fddf857851a27b" +
                "&hash=bd3fe11cc3a47a90501a11360b644ec2";

        Log.v("urll","urll"+url);

        OkHttpClient client = new OkHttpClient();


        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = null;
        String res = "";

        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            res = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.v("response", "response" + res);

        return getsuperHeroDatafromJson(res);
    }

    public String getsuperHeroDatafromJson(String data) {

        Gson gson = new GsonBuilder().create();

        ComicData data1 = gson.fromJson(data, ComicData.class);

        description = new ArrayList<String>();

        for(int i =0; i<data1.getData().getResults().length; i++) {

            description.add(data1.getData().getResults()[i].getTitle());


        }

        return null;
    }

    @Override
    protected void onPostExecute(String data) {
        super.onPostExecute(data);
        progressDialog.dismiss();
    }
}
