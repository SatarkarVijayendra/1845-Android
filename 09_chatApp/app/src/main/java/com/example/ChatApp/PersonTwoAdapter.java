package com.example.ChatApp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class PersonTwoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<MsgModel1> myDataset;
    public static final int MESSAGE_TYPE_IN = 1;
    public static final int MESSAGE_TYPE_OUT = 2;



    public PersonTwoAdapter(ArrayList<MsgModel1> PersonTwo) {
        myDataset = PersonTwo;
    }

    private class IncomingViewHolder extends RecyclerView.ViewHolder{
        public MaterialTextView textView;

        public IncomingViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.incomingptwo);
        }
        void bind(int position) {
            MsgModel1 messageModel = myDataset.get(position);
            textView.setText(messageModel.text);

        }
    }

    private class OutgoingViewHolder extends RecyclerView.ViewHolder {

        public MaterialTextView textView;
        public OutgoingViewHolder(final View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.outgoingptwo);

        }
        void bind(int position) {
            MsgModel1 messageModel = myDataset.get(position);
            textView.setText(messageModel.text);

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        if (viewType == MESSAGE_TYPE_OUT){
            return new OutgoingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.two_outgoing,parent,false));

        }
        else{
            return new IncomingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.two_incoming,parent,false));

        }


    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(myDataset.get(position).type == MESSAGE_TYPE_OUT){
            ((OutgoingViewHolder) holder).bind(position);

        }
        else{
            ((IncomingViewHolder) holder).bind(position);
        }


    }

    @Override
    public int getItemCount() {
        return myDataset.size();
    }

    @Override
    public int getItemViewType(int position) {
        return myDataset.get(position).type;
    }



}

