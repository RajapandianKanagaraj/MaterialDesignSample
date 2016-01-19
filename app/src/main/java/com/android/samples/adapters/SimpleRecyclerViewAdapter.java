package com.android.samples.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.samples.R;

/**
 * Created by a6000388 on 1/7/16.
 */
public class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<SimpleRecyclerViewAdapter.ViewHolder>{

    private String[] cities = { "Newyork", "London", "Melbourne", "Paris", "Edinburgh", "Tokyo", "Vienna", "Madrid", "Shanghai", "Seol", "Perth", "Dublin", "Columbus", "San Jose", "Hong Kong", "Miami", "Auckland", "Sydney", "Calgary"};
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item_layout, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemText.setText(cities[position]);
    }

    @Override
    public int getItemCount() {
        return cities.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView itemText;
        public ViewHolder(View itemView) {
            super(itemView);
            itemText = (TextView)itemView.findViewById(R.id.item_text);
        }
    }
}
