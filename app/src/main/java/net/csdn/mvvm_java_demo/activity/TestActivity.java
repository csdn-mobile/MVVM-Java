package net.csdn.mvvm_java_demo.activity;

import android.os.Bundle;
import android.view.View;

import net.csdn.mvvm_java.bus.LiveDataBus;
import net.csdn.mvvm_java.ui.activity.BaseBindingViewModelActivity;
import net.csdn.mvvm_java_demo.Constants;
import net.csdn.mvvm_java_demo.lifecycle.LifeTest;
import net.csdn.mvvm_java_demo.lifecycle.LifeTest2;
import net.csdn.mvvm_java_demo.viewmodel.TestViewModel;

import net.csdn.mvvm_java_demo.BR;
import net.csdn.mvvm_java_demo.R;
import net.csdn.mvvm_java_demo.databinding.ActivityTestBinding;

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