package com.c9mj.platform.live.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.c9mj.platform.R;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation_swipeback.SwipeBackActivity;

/**
 * author: LMJ
 * date: 2016/9/12
 * 观看直播Activity
 */
public class LivePlayActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_play);
    }
}