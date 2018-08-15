package com.zero.yoga.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zero.yoga.R;
import com.zero.yoga.base.TBaseRecyclerAdapter;

/**
 * Created by zero on 2018/8/14.
 */

public class StadiumListAdapter extends TBaseRecyclerAdapter<String> {


    public StadiumListAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder CreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        RecyclerView.ViewHolder holder = null;
        View view = inflater.inflate(R.layout.item_test, parent, false);
        holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void BindData(RecyclerView.ViewHolder holder, String data, int position) {
        final ViewHolder vholder = (ViewHolder) holder;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivIcon;
        public TextView tvStadiumName;
        public TextView tvStadiumAddr;
        public TextView tvStadiumDis;

        ViewHolder(View view) {
            super(view);
            ivIcon = view.findViewById(R.id.ivIcon);
            tvStadiumName = view.findViewById(R.id.tvStadiumName);
            tvStadiumAddr = view.findViewById(R.id.tvStadiumAddr);
            tvStadiumDis = view.findViewById(R.id.tvStadiumDis);
        }
    }
}
