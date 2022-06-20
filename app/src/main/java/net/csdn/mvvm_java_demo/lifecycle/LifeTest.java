package net.csdn.mvvm_java_demo.lifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleOwner;

import net.csdn.mvvm_java.lifecycle.LifecycleObserverImpl;

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
