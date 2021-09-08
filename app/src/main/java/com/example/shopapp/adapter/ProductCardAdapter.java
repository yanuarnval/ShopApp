package com.example.shopapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.shopapp.R;
import com.example.shopapp.networking.ProducEntry;
import com.example.shopapp.viewholder.productCardViewHolder;

import java.util.List;

public class ProductCardAdapter extends RecyclerView.Adapter<productCardViewHolder> {
    List<ProducEntry> list;

    public ProductCardAdapter(List<ProducEntry> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public productCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_card,parent,false);
        return new productCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productCardViewHolder holder, int position) {
        ProducEntry entry = list.get(position);
        holder.title.setText(entry.title);
        holder.description.setText(entry.price);
        Glide.with(holder.imageView.getContext()).load(entry.url).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
