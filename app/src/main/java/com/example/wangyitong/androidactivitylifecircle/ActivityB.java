package com.example.wangyitong.androidactivitylifecircle;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {
    private static String Suffix = "B:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d(ConstData.TAG, Suffix + "onCreate()");
        findViewById(R.id.btn_start_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startService(new Intent("com.example.wangyitong.androidactivityliftcircle.SERVICE"));
            }
        });

        findViewById(R.id.btn_stop_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(ActivityB.this, MyService.class));
            }
        });
        final MyServiceConnection myServiceConnection = new MyServiceConnection();


        findViewById(R.id.btn_set_result_to_A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });
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

    class MyServiceConnection implements ServiceConnection {
        private static final String Suffix = "MyServiceConnection:";

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            Log.d(ConstData.TAG, Suffix + "onServiceConnected()");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(ConstData.TAG, Suffix + "onServiceDisconnected()");

        }
    }
}
