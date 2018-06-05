package com.example.d.finalbutterknife.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d.finalbutterknife.BreedsActivity;
import com.example.d.finalbutterknife.R;

import butterknife.ButterKnife;

/**
 * Created by D on 6/5/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private Context context;


    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.breed_itemview,parent,false);
        context = parent.getContext();
        return new Holder(view );
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class Holder extends RecyclerView.ViewHolder {
        public Holder(View itemView) {
            super(itemView);

            ButterKnife.bind((BreedsActivity)itemView.getContext());
        }
    }
}
