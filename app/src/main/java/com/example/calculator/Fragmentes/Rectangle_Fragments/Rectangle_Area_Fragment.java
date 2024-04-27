package com.example.calculator.Fragmentes.Rectangle_Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.R;


public class Rectangle_Area_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rectangle__area_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button r_Area_btn = view.findViewById(R.id.rectangle_btn_calculate_area);
        EditText rectangle_width = view.findViewById(R.id.rectangle_width);
        EditText rectangle_height = view.findViewById(R.id.rectangle_height);
        TextView rectangle_result = view.findViewById(R.id.rectangle_result_area);

        r_Area_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rr_width = rectangle_width.getText().toString();

                String rr_height = rectangle_height.getText().toString();
                if(!rr_width.isEmpty() || !rr_height.isEmpty()){
                    double r_width = Double.parseDouble(rectangle_width.getText().toString());
                    double r_height = Double.parseDouble(rectangle_height.getText().toString());
                    double res = (r_width * r_height);
                    int res1 = (int) res;
                    if (res == res1){
                        rectangle_result.setText(String.valueOf(res1));
                    }else {
                        rectangle_result.setText(String.valueOf(res));
                    }
                }else{
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}