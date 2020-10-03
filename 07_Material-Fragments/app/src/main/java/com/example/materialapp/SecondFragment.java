package com.example.materialapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class SecondFragment extends Fragment {

   private View card;
    private Button DatePicker;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        TextInputEditText textInput= view.findViewById(R.id.goa);
        textInput.setFocusable(false);

        DatePicker= view.findViewById(R.id.btndate);
        final MaterialTextView dateview= (MaterialTextView) view.findViewById(R.id.txtbirth);

       // Intent intent= getActivity().getIntent();
        //String personName= intent.getStringExtra(MainActivity.sendMessage);
        MaterialTextView nametext= view.findViewById(R.id.txtname);
        nametext.setText("name");

        MaterialDatePicker.Builder builder= MaterialDatePicker.Builder.datePicker();

        final MaterialDatePicker materialDatePicker= builder.build();

        DatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialDatePicker.show(getFragmentManager(),"Date_Picker");

            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                dateview.setText(materialDatePicker.getHeaderText());

            }
        });
        getActivity().setTitle("Address");
        setHasOptionsMenu(true);



        // Inflate the layout for this fragment
        return view;
    }
}