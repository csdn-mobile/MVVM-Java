package net.csdn.mvvm_java_demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.lifecycle.Observer;

import net.csdn.mvvm_java_demo.Constants;
import net.csdn.mvvm_java_demo.R;
import net.csdn.mvvm_java_demo.databinding.ActivityMainBinding;

import net.csdn.mvvm_java.bus.LiveDataBus;
import net.csdn.mvvm_java.ui.activity.BaseBindingActivity;

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