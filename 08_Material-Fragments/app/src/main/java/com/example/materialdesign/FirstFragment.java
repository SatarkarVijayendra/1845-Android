package com.example.materialdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesign.R;
import com.google.android.material.textfield.TextInputEditText;


public class FirstFragment extends Fragment {


    public static final String sendMessage="com.example.materialapp";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_first,container,false);

        TextInputEditText input;
        input= (TextInputEditText) view.findViewById(R.id.txtname);

        getActivity().setTitle("Login");
        return view;
    }

}