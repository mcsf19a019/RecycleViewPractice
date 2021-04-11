package com.example.recycleviewpractice;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Grocery> groceryList;
    Activity mAct;

    public RecyclerViewAdapter(List<Grocery> friendsList, Activity mAct) {
        this.groceryList = groceryList;
        this.mAct = mAct;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewGrcery;
        TextView textGroceryName;
        TextView textExpDate;
        TextView textPrice;
        Grocery data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //imageViewGrcery = itemView.findViewById(R.id.groceryPrice);
            textGroceryName = itemView.findViewById(R.id.groceryName);
            textExpDate = itemView.findViewById(R.id.expDate);
            textPrice = itemView.findViewById(R.id.groceryPrice);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grocery, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.data=groceryList.get(position);
        holder.textGroceryName .setText(holder.data.getName());
        holder.textExpDate.setText(String.valueOf(holder.data.getExp()));
        //holder.imageViewFriend.setImageResource(R.drawable.airplane);
        holder.textPrice.setText(holder.data.getPrice());
        //Glide.with(mAct).load("https://homepages.cae.wisc.edu/~ece533/images/airplane.png").into(holder.imageViewFriend);
    }

    @Override
    public int getItemCount() {
        return groceryList.size();
    }

}
