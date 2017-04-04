package com.example.android.pets;

/**
 * Created by Shruti Pabboju on 4/1/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //redirect to LoginActivity after 2 seconds
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,LogActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}