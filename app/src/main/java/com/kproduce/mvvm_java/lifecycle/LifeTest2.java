package com.kproduce.mvvm_java.lifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import com.kproduce.mvvm.lifecycle.LifecycleObserverInterface;

public class LifeTest2 implements LifecycleObserverInterface {

    @Override
    public void onCreate(LifecycleOwner owner) {
        Log.e("LifeTest2", "========onCreate");
    }

    @Override
    public void onStart(LifecycleOwner owner) {
    }

    @Override
    public void onResume(LifecycleOwner owner) {
        Log.e("LifeTest2", "========onResume");
    }

    @Override
    public void onPause(LifecycleOwner owner) {

    }

    @Override
    public void onStop(LifecycleOwner owner) {

    }

    @Override
    public void onDestroy(LifecycleOwner owner) {

    }

    @Override
    public void onAny(LifecycleOwner owner) {

    }
}
