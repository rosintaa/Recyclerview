package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private ArrayList<Model> Models;

    public Adapter(ArrayList<Model> listData, Context context) {
        this.context = context;
    }

    public ArrayList<Model> getModels() {
        return Models;
    }

    public void setModels(ArrayList<Model> Models) {
        this.Models = Models;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_company,viewGroup,false);
        return new ViewHolder(itRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(getModels().get(i).getLambangTeam()).into(viewHolder.ivLambangCompany);
        viewHolder.tvNamaCompany.setText(getModels().get(i).getNamaTeam());
        viewHolder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getModels().get(i).getPrivew());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });

        viewHolder.visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("logo", getModels().get(i).getLambangTeam());
                intent.putExtra("nama", getModels().get(i).getNamaTeam());
                intent.putExtra("preview", getModels().get(i).getPrivew());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivLambangCompany;
        private TextView tvNamaCompany;
        private Button share;
        private Button visit;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivLambangCompany = itemView.findViewById(R.id.IV);
            tvNamaCompany = itemView.findViewById(R.id.nama_company);
            share = itemView.findViewById(R.id.btn_share);
            visit = itemView.findViewById(R.id.btn_preview);
        }
    }
}
