package com.kproduce.mvvm_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.lifecycle.Observer;

import com.kproduce.mvvm_java.databinding.ActivityMainBinding;

import net.csdn.mvvm.bus.LiveDataBus;
import net.csdn.mvvm.ui.activity.BaseBindingActivity;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LiveDataBus.getInstance()
                .with(Constants.BusEvent.TEST, String.class)
                .observe(this, new Observer<String>() {
                    @Override
                    public void onChanged(String str) {
                        mBinding.tvShow.setText(str);
                    }
                });

        mBinding.btnGoTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
    }

}