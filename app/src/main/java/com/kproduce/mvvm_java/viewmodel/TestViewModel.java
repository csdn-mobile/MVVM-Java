package com.kproduce.mvvm_java.viewmodel;

import com.kproduce.mvvm.ui.adapter.BindingViewModelAdapter;
import com.kproduce.mvvm.viewmodel.BaseViewModel;
import com.kproduce.mvvm_java.BR;
import com.kproduce.mvvm_java.R;
import com.kproduce.mvvm_java.bean.TestBean;
import com.kproduce.mvvm_java.databinding.ItemTestBinding;

import java.util.ArrayList;
import java.util.List;

public class TestViewModel extends BaseViewModel {

    public BindingViewModelAdapter<TestBean, ItemTestBinding, TestAdapterViewModel> adapter;

    public TestViewModel() {
        List<TestBean> datas = new ArrayList<>();
        datas.add(new TestBean("张三"));
        datas.add(new TestBean("李四"));
        datas.add(new TestBean("王五"));
        datas.add(new TestBean("徐六"));
        datas.add(new TestBean("你爹"));
        adapter = new BindingViewModelAdapter<>(R.layout.item_test, BR.viewmodel, datas);
    }

}
