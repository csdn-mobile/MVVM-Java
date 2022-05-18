package net.csdn.mvvm.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BindingAdapter<T, DB extends ViewDataBinding> extends RecyclerView.Adapter<BindingHolder<DB>> {

    private final int mLayoutId;
    private final int mVariableId;
    private List<T> mDatas;

    protected BindingAdapter(@LayoutRes int layoutId, int variableId, List<T> datas) {
        this.mLayoutId = layoutId;
        this.mVariableId = variableId;
        this.mDatas = datas;
        if (this.mDatas == null) {
            this.mDatas = new ArrayList<>();
        }
    }

    @NonNull
    @Override
    public BindingHolder<DB> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DB binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), mLayoutId, parent, false);
        return new BindingHolder<>(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BindingHolder<DB> holder, int position) {
        holder.mBinding.setVariable(mVariableId, mDatas.get(position));
        holder.mBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

}
