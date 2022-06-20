package net.csdn.mvvm_java.ui.activity;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import net.csdn.mvvm_java.AppContext;

/**
 * @author by KG on 2022/05/13
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppContext.application = getApplication();
    }

    /**
     * 获取布局ID
     *
     * @return 布局ID
     */
    @LayoutRes
    public abstract int getLayoutId();

}
