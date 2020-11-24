package com.example.materialdesign;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.materialdesign.R;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class SecondFragment extends Fragment {

   private View card;
    private Button DatePicker;
    MaterialTextView txtname;

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


        MaterialTextView txtname= view.findViewById(R.id.txtname);


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



        // Inflate the layout for this fragment
        return view;
    }
}