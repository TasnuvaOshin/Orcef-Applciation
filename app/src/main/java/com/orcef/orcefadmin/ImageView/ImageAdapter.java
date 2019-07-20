package com.orcef.orcefadmin.ImageView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.orcef.orcefadmin.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder> {
    ArrayList<ImageData> list;
    Context context;

    public ImageAdapter() {
    }

    public ImageAdapter(ArrayList<ImageData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.img_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {
        final ImageData current = list.get(position);
        Log.d("get",current.getImg());
        Picasso.get().load("http://renata-vision.xyz/rx_photo/"+current.getImg()).into(holder.imageView);

                PhotoViewAttacher pAttacher;
                pAttacher = new PhotoViewAttacher(holder.imageView);
                pAttacher.update();
                Toast.makeText(context, "Please Tap The Screen To Apply Zoom", Toast.LENGTH_SHORT).show();





    }

    @Override
    public int getItemCount() {
        return list.size();
    }



}
