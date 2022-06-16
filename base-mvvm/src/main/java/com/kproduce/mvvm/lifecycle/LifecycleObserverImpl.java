package com.kproduce.mvvm.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class LifecycleObserverImpl implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected void onCreate(LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    protected void onStart(LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected void onResume(LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    protected void onPause(LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    protected void onStop(LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected void onDestroy(LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    protected void onAny(LifecycleOwner owner) {
    }
}
