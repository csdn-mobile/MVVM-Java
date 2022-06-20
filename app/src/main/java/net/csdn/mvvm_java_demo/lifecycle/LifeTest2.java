package net.csdn.mvvm_java_demo.lifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import net.csdn.mvvm_java.lifecycle.LifecycleObserverInterface;

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
