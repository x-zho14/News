package com.ihandy.a2014010845.news;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhou on 2016/9/2.
 */
public class TabAdapter extends RecyclerView.Adapter<TabAdapter.ItemViewHolder>{
    private List<Integer> list;

    public TabAdapter() {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    @Override
    public void onBindViewHolder(ItemViewHolder holder, final int position) {
        holder.textView.setText("123222222222222222");

    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.recycler_view_item_layout, parent,false);
        return new ItemViewHolder(view);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ItemViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.itemView);
        }
    }
}






