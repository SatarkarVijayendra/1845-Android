package com.example.RecycleViewDeleteList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context myContext;
    private ArrayList<MsgModel>letters;
    View view;
    MsgModel data;
    public MyAdapter(Context myContext,ArrayList<MsgModel> letters)
    {
        this.myContext=myContext;
        this.letters=letters;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view= LayoutInflater.from(myContext).inflate(R.layout.items,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.textView.setText(letters.get(position).getName());
        holder.imageView.setImageResource(letters.get(position).getImage());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(mContext,"deleted",Toast.LENGTH_SHORT).show();
                data=new MsgModel(letters.get(position).getName(),letters.get(position).getImage());
                deleteItem(position,view);
            }
        });

    }

    private void deleteItem(final int position, View view)
    {
        letters.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,letters.size());
        Snackbar.make(view,"UNDO"+data.getName(),Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letters.add(position,data);
                notifyItemInserted(position);
                notifyItemRangeChanged(position,letters.size());

            }
        }).setActionTextColor(myContext.getResources().getColor(android.R.color.holo_blue_dark)).show();
    }

    @Override
    public int getItemCount() {
        return letters.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView,delete;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            delete=itemView.findViewById(R.id.delete);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
