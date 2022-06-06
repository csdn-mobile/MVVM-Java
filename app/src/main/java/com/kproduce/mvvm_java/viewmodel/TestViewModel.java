package com.kproduce.mvvm_java.viewmodel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;

import com.kproduce.mvvm.ui.adapter.BindingViewModelAdapter;
import com.kproduce.mvvm.viewmodel.BaseViewModel;
import com.kproduce.mvvm_java.BR;
import com.kproduce.mvvm_java.R;
import com.kproduce.mvvm_java.bean.TestBean;
import com.kproduce.mvvm_java.databinding.ItemTestBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestViewModel extends BaseViewModel {

    public BindingViewModelAdapter<TestBean, ItemTestBinding> adapter;

    public MutableLiveData<String> number;

    public TestViewModel() {
        number = new MutableLiveData<>("0");
        List<TestBean> datas = new ArrayList<>();
        datas.add(new TestBean("张三"));
        datas.add(new TestBean("李四"));
        datas.add(new TestBean("王五"));
        datas.add(new TestBean("徐六"));
        datas.add(new TestBean("777"));
        adapter = new BindingViewModelAdapter<>(R.layout.item_test, BR.viewmodel, TestAdapterViewModel.class, datas);
    }

    public View.OnClickListener changeNumber(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = new Random().nextInt(100);
                number.setValue(i + "");
            }
        };
    }
}
