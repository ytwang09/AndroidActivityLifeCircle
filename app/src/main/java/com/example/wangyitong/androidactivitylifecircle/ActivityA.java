package com.example.wangyitong.androidactivitylifecircle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ActivityA extends AppCompatActivity {
    private static String Suffix = "A:";

    private SimpleImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.d(ConstData.TAG, Suffix + "onCreate()");

        img = (SimpleImageView) findViewById(R.id.sim_img);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ConstData.TAG, Suffix + "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(ConstData.TAG, Suffix + "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ConstData.TAG, Suffix + "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ConstData.TAG, Suffix + "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ConstData.TAG, Suffix + "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ConstData.TAG, Suffix + "onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(ConstData.TAG, Suffix + "onSaveInstanceState()");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(ConstData.TAG, Suffix + "onActivityResult()");
    }
}
