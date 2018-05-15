package com.example.ramyesteero.petra;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lucasurbas.listitemview.ListItemView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitch on 5/14/18.
 */

public class RockCollectionAdapter extends RecyclerView.Adapter<RockCollectionAdapter.ViewHolder> {

    ArrayList<Rock> rocks;

    // Provide a reference to the views for each data item
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ListItemView view;
        private ViewHolder(ListItemView v) {
            super(v);
            view = v;
        }
    }

    public RockCollectionAdapter(ArrayList<Rock> rocks) {
        this.rocks = rocks;
    }

    @Override
    public RockCollectionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        ListItemView v = (ListItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rock_collection_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.view.setTitle(rocks.get(position).name);
        holder.view.setSubtitle(TextUtils.join(", ", rocks.get(position).minerals));

    }

    @Override
    public int getItemCount() {
        return rocks.size();
    }

}
