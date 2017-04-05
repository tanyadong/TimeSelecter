package com.tiandy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.tiandy.timeselecterlibrary.dateutil.TimeSelector;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView startTimeTxt, endTimeTxt;
    private TimeSelector timeSelector;
    private final static String STARTTIME = "1980-01-01 00:00"; //时间控件 开始时间
    private final static String ENDTIME =  "2150-12-31 23:59";//时间控件 结束时间
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
        addListener();
    }
    /**
    * @author  谭亚东
    * @Title: 初始化
    * @Description: 初始化相关操作
    * @date 2017/2/21 14:29
    */
    private void init() {
        timeSelector = new TimeSelector(this, null,"1980-01-01 00:00" , "2150-12-31 23:59");
        startTimeTxt = (TextView) findViewById(R.id.txt_starttime);
        endTimeTxt = (TextView) findViewById(R.id.txt_endtime);
    }
    public void addListener() {
        startTimeTxt.setOnClickListener(this);
        endTimeTxt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_starttime:
                timeSelector.show(startTimeTxt);
                // 日期格式为yyyy-MM-dd
                break;
            case R.id.txt_endtime:
                timeSelector.show(endTimeTxt);
                break;
        }
    }
}
