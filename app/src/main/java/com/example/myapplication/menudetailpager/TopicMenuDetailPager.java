package com.example.myapplication.menudetailpager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.base.MenuDetaiBasePager;

import org.xutils.common.util.LogUtil;

/**
 * Created by 陈宣嘉 on 2018/10/13.
 */

public class TopicMenuDetailPager extends MenuDetaiBasePager {

    private TextView textView;
    public TopicMenuDetailPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        textView=new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        LogUtil.e("专题页面初始化");
        textView.setText("专题详情页面");
    }
}
