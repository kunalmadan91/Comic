package com.kunalmadan.android.comiclover;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

      /* if(isConnectingToInternet()) {
            Log.v("Connected to internet","Connected to internet");*/

           new Handler().postDelayed(new Runnable() {

               @Override
               public void run() {
                   // This method will be executed once the timer is over
                   // Start your app main activity
                   Intent i = new Intent(Splash.this, MainActivity.class);
                   startActivity(i);

                   // close this activity
                   finish();
               }
           }, SPLASH_TIME_OUT);

       /* }
        else {

           AlertDialog alertDialog = new AlertDialog.Builder(Splash.this).create();


           alertDialog.setTitle("Info");
           alertDialog.setMessage("Internet not available," +
                   " Cross check your internet connectivity and try again");
//alertDialog.setIcon(R.drawable.alerticon);
           alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   finish();

               }
           });

           alertDialog.show();

        }*/

    }

    public boolean isConnectingToInternet(){

        ConnectivityManager cm =
                (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        return isConnected;
    }
}
