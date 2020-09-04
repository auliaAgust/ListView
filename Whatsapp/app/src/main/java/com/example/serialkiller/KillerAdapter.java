package com.example.serialkiller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class KillerAdapter extends RecyclerView.Adapter<KillerAdapter.ListViewHolder> {

    private ArrayList<BarisKontak> listKiller;
    public  KillerAdapter(ArrayList<BarisKontak> daftar){
        this.listKiller = daftar;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_killer, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        BarisKontak kill = listKiller.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kill.getFoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPoto);
        holder.tvName.setText(kill.getNama());
        holder.tvDetail.setText(kill.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listKiller.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
