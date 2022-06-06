package com.kproduce.mvvm_java.viewmodel;

import com.kproduce.mvvm.viewmodel.BaseAdapterViewModel;
import com.kproduce.mvvm_java.bean.TestBean;

public class TestAdapterViewModel extends BaseAdapterViewModel<TestBean> {

    protected TestAdapterViewModel(int position, TestBean data) {
        super(position, data);
    }


}
