package com.kproduce.mvvm_java.lifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import com.kproduce.mvvm.lifecycle.LifecycleObserverImpl;

public class LifeTest extends LifecycleObserverImpl {

    @Override
    public void onCreate(LifecycleOwner owner) {
        Log.e("LifeTest", "========onCreate");
    }

    @Override
    public void onResume(LifecycleOwner owner) {
        Log.e("LifeTest", "========onResume");
    }
}
