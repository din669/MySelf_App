package com.example.myselfapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//NIM    : 10119216
//Nama   : Muhammad Syarifuddin Rahiman
//Kelas  : IF-6
//Tanggal Pengerjaan : 22-05-2022

import java.util.ArrayList;

public class GaleryAdapter extends RecyclerView.Adapter<GaleryAdapter.myviewholder> {

    ArrayList<GaleryModel> galeryModel;

    public GaleryAdapter(ArrayList<GaleryModel> galeryModel) {
        this.galeryModel = galeryModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_galery, parent, false);
        return new GaleryAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivGallery.setImageResource(galeryModel.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return galeryModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivGallery = itemView.findViewById(R.id.iv_galery);
        }
    }


}
