package com.orcef.orcefadmin.ImageView;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.orcef.orcefadmin.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public Button button;
    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img);
      //  button = itemView.findViewById(R.id.button);


    }
}
