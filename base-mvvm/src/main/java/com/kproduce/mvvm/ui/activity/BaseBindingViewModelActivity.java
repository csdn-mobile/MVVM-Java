package com.kproduce.mvvm.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import com.kproduce.mvvm.viewmodel.BaseViewModel;

/**
 * 使用DataBinding与ViewModel的Activity基类
 *
 * @author by KG on 2022/05/13
 */
public abstract class BaseBindingViewModelActivity<DB extends ViewDataBinding, VM extends BaseViewModel> extends BaseActivity {

    protected DB mBinding;
    protected VM mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        mBinding = DataBindingUtil.setContentView(this, getLayoutId());
        mViewModel = new ViewModelProvider(this).get(getViewModelClass());
        mBinding.setLifecycleOwner(this);
        mBinding.setVariable(getVariableId(), mViewModel);
    }

//    private Class<VM> getViewModelClass() {
//        Type type = getClass().getGenericSuperclass();
//        return (Class<VM>) ((ParameterizedType) type).getActualTypeArguments()[1];
//    }

    /**
     * 获取ViewModel在DataBinding布局中的ID
     * 例：BR.viewModel
     *
     * @return variable的ID
     */
    public abstract int getVariableId();

    /**
     * 获取当前ViewModel类的class
     *
     * @return ViewModel类的class
     */
    public abstract Class<VM> getViewModelClass();
}
