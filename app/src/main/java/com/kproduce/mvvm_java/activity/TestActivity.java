package com.kproduce.mvvm_java.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kproduce.mvvm.bus.LiveDataBus;
import com.kproduce.mvvm.ui.activity.BaseBindingViewModelActivity;
import com.kproduce.mvvm_java.BR;
import com.kproduce.mvvm_java.Constants;
import com.kproduce.mvvm_java.R;
import com.kproduce.mvvm_java.databinding.ActivityTestBinding;
import com.kproduce.mvvm_java.lifecycle.LifeTest;
import com.kproduce.mvvm_java.lifecycle.LifeTest2;
import com.kproduce.mvvm_java.viewmodel.TestViewModel;

public class TestActivity extends BaseBindingViewModelActivity<ActivityTestBinding, TestViewModel> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    public int getVariableId() {
        return BR.viewmodel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new LifeTest());
        getLifecycle().addObserver(new LifeTest2());
        mBinding.btnSendBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LiveDataBus.getInstance()
                        .with(Constants.BusEvent.TEST, String.class)
                        .setValue("哈哈哈哈");
            }
        });

        mBinding.setViewmodel(mViewModel);
    }

}