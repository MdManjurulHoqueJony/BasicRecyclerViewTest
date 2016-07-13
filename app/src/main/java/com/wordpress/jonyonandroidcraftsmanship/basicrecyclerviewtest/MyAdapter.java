package com.wordpress.jonyonandroidcraftsmanship.basicrecyclerviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class MyAdapter extends Adapter<MyAdapter.MyViewHolder> {

    private LayoutInflater inflater = null;
    private List<Data> datas= Collections.emptyList();
    public MyAdapter(Context context,List<Data> datas) {
        inflater = LayoutInflater.from(context);
        this.datas=datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_row, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data=datas.get(position);
        holder.tvTest.setText(data.getTitle());
        holder.ivTest.setImageResource(data.getIconId());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivTest;
        TextView tvTest;

        public MyViewHolder(View itemView) {
            super(itemView);
            ivTest = (ImageView) itemView.findViewById(R.id.ivTest);
            tvTest = (TextView) itemView. findViewById(R.id.tvTest);
        }
    }
}
