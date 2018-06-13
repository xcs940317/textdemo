package com.onlineradio.auto.demo2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/6/11.
 */

public class LeakCanaryActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取单例对象，退出Activity即可模拟出内存泄露
        TestManager testManager = TestManager.getInstance(this);

    }
}
