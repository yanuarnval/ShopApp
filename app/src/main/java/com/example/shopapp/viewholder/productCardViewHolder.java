package com.example.shopapp.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopapp.R;

public class productCardViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView title, description;

    public productCardViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.product_image);
        title = itemView.findViewById(R.id.product_title);
        description = itemView.findViewById(R.id.product_price);
    }
}
