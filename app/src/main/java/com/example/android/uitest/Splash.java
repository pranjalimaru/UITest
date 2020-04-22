package com.example.android.uitest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.LoginFiles.Login;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(Splash.this, Login.class);
                //to run the next activity
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
