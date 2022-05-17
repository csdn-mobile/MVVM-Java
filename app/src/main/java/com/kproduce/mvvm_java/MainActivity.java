package com.kproduce.mvvm_java;

import android.os.Bundle;

import com.kproduce.mvvm_java.databinding.ActivityMainBinding;

import net.csdn.mvvm.ui.activity.BaseBindingActivity;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}