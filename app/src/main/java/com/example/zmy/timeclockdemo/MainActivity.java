package com.example.zmy.timeclockdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.zmy.timeclockdemo.customer.view.TimeClock;

public class MainActivity extends AppCompatActivity {

    /**
     * 主界面
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimeClock timeClock = new TimeClock(this);
        FrameLayout frameLayout = findViewById(R.id.frame_time);
        //将绘制的View添加到Fragment布局中
        frameLayout.addView(timeClock);
    }
}
