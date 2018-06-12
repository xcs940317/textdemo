package com.onlineradio.auto.demo2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.autosee.ting.sdk.NetTing;
import com.autosee.ting.sdk.TingPlayerManager;

/**
 * Created by Administrator on 2018/6/11.
 */

public class ServiceA extends Service {
    public static final String TAG=ServiceA.class.getSimpleName();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        NetTing.getInstance().init(this);
        TingPlayerManager.getInstance().init(this);
        Log.w(TAG,"onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.w(TAG,"onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.w(TAG,"onDestroy");
        super.onDestroy();
    }
}
