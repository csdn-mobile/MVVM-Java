package com.kproduce.mvvm_java.lifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import com.kproduce.mvvm.lifecycle.LifecycleObserverImpl;

public class LifeTest extends LifecycleObserverImpl {

    @Override
    protected void onCreate(LifecycleOwner owner) {
        Log.e("LifeTest", "========onCreate");
    }

    @Override
    protected void onResume(LifecycleOwner owner) {
        Log.e("LifeTest", "========onResume");
    }
}
