package net.csdn.mvvm_java_demo.viewmodel;

import net.csdn.mvvm_java.viewmodel.BaseAdapterViewModel;
import net.csdn.mvvm_java_demo.bean.TestBean;

public class TestAdapterViewModel extends BaseAdapterViewModel<TestBean> {

    protected TestAdapterViewModel(int position, TestBean data) {
        super(position, data);
    }


}
