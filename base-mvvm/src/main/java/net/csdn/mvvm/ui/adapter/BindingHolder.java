package net.csdn.mvvm.ui.adapter;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class BindingHolder<DB extends ViewDataBinding> extends RecyclerView.ViewHolder {

    public final DB mBinding;

    public BindingHolder(@NonNull DB binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }
}
