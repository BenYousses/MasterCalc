package com.example.calculator.Activties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.calculator.R;

public class Splash_Activity extends AppCompatActivity {
    Handler handler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
 handler = new Handler();
 Runnable  runnable = new Runnable() {
     @Override
     public void run() {
         Intent intent = new Intent(getBaseContext(), MainActivity.class);
         startActivity(intent);
         finish();
     }
 };
   handler.postDelayed(runnable , 2000);


    }
}