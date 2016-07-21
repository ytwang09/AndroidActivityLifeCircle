package com.example.wangyitong.androidactivitylifecircle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by wangyitong on 2016/7/19.
 */
public class MyService extends Service {
    private static final String suffix = "MyService:";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(ConstData.TAG, suffix + "onCreate()");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(ConstData.TAG, suffix + "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(ConstData.TAG, suffix + "onStartCommand()");
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(ConstData.TAG, suffix + "onDestroy()");
    }
}
