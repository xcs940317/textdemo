package com.onlineradio.auto.demo2;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Administrator on 2018/6/11.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 安装LeakCanary
        LeakCanary.install(this);
    }
}
