package com.kproduce.mvvm.databinding;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.BindingAdapter;

/**
 * NestedScrollView的自定义属性
 *
 * @author by KG on 2022/06/10
 */
public class NestedScrollViewBindingAdapter {

    /**
     * NestedScrollView设置滚动监听
     */
    @BindingAdapter("bind_onScrollChangeListener")
    public static void setOnScrollChangeListener(NestedScrollView scrollView, NestedScrollView.OnScrollChangeListener onScrollChangeListener) {
        if (onScrollChangeListener != null) {
            scrollView.setOnScrollChangeListener(onScrollChangeListener);
        }
    }
}
