package net.csdn.mvvm_java_demo.viewmodel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;

import net.csdn.mvvm_java.ui.adapter.BindingViewModelAdapter;
import net.csdn.mvvm_java.viewmodel.BaseViewModel;
import net.csdn.mvvm_java_demo.BR;
import net.csdn.mvvm_java_demo.R;
import net.csdn.mvvm_java_demo.bean.TestBean;
import net.csdn.mvvm_java_demo.databinding.ItemTestBinding;

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
