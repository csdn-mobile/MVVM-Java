package com.kproduce.mvvm.ui.adapter;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

import com.kproduce.mvvm.viewmodel.BaseAdapterViewModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 单个布局使用DataBinding和ViewModel的Adapter
 *
 * （注：此处的ViewModel仅是将逻辑挪移到ViewModel中，没有生命周期作用。
 * 因为每个ViewModel只会在Owner中保存一份，并且数据的恢复应该由整个页面的ViewModel负责）
 *
 * @author by KG on 2022/05/19
 */
public class BindingViewModelAdapter<T, DB extends ViewDataBinding, VM extends BaseAdapterViewModel<T>> extends BaseAdapter<T, DB> {

    private final Class<VM> mVmClass;

    public BindingViewModelAdapter(@LayoutRes int layoutId, int variableId, List<T> datas) {
        super(layoutId, variableId, datas);
        this.mVmClass = getViewModelClass();
    }

    @Override
    public void onBind(DB dataBinding, T data) {
        VM instance = getViewModelInstance(data);
        if (instance != null) {
            dataBinding.setVariable(mVariableId, instance);
        }
    }

    private Class<VM> getViewModelClass() {
        Type type = getClass().getGenericSuperclass();
        return (Class<VM>) ((ParameterizedType) type).getActualTypeArguments()[2];
    }

    private VM getViewModelInstance(T data) {
        VM instance = null;
        if (mVmClass != null) {
            try {
                Constructor<VM> declaredConstructor = mVmClass.getDeclaredConstructor(data.getClass());
                instance = declaredConstructor.newInstance(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
