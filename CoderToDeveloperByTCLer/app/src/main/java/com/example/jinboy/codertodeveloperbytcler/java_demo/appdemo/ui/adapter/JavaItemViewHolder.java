package com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.R;
import com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.entity.JavaEntity;
import com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.ui.JavaDemoActivity;

/**
 * <pre>
 *     author : JinBiao
 *     CSDN : http://my.csdn.net/DT235201314
 *     time   : 2017/06/05
 *     desc   : Java概述页ViewHolder
 *     version: 1.0
 * </pre>
 */

public class JavaItemViewHolder extends BaseItemViewHolder<JavaEntity> {
    private TextView mItemNameTv;
    private TextView mItemIntroTv;

    JavaItemViewHolder(Context context, View itemView) {
        super(context, itemView);
        mItemNameTv = (TextView) itemView.findViewById(R.id.tv_home_head_item_name);
        mItemIntroTv = (TextView) itemView.findViewById(R.id.tv_intro);
    }

    @Override
    public void onBindViewHolder(JavaEntity entity) {
        mItemIntroTv.setText(entity.getIntro());
        updateHeadInfos(entity,R.color.title_line1,entity.getTitle());
    }

    @Override
    void onHeadViewClick(JavaEntity entity) {
        super.onHeadViewClick(entity);
        Intent intent = new Intent(mContext,JavaDemoActivity.class);
        mContext.startActivity(intent);
    }
}
