package com.kproduce.mvvm_java.activity;

import android.os.Bundle;
import android.view.View;

import com.kproduce.mvvm_java.Constants;
import com.kproduce.mvvm_java.R;
import com.kproduce.mvvm_java.databinding.ActivityTestBinding;

import net.csdn.mvvm.bus.LiveDataBus;
import net.csdn.mvvm.ui.activity.BaseBindingActivity;

public class TestActivity extends BaseBindingActivity<ActivityTestBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding.btnSendBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LiveDataBus.getInstance()
                        .with(Constants.BusEvent.TEST, String.class)
                        .setValue("哈哈哈哈");
            }
        });
    }

}