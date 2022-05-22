package com.example.myselfapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

//NIM    : 10119216
//Nama   : Muhammad Syarifuddin Rahiman
//Kelas  : IF-6
//Tanggal Pengerjaan : 22-05-2022

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.myviewholder>{

    ArrayList<DailyModel> dailyModel;

    public DailyAdapter(ArrayList<DailyModel> dailyModel) {
        this.dailyModel = dailyModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_daily, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.icDaily.setImageResource(dailyModel.get(position).getImage());
        holder.tvTitle.setText(dailyModel.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dailyModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView icDaily;
        TextView tvTitle;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            icDaily = itemView.findViewById(R.id.ic_daily);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
