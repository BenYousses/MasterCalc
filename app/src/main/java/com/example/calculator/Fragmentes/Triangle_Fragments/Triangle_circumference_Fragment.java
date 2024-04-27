package com.example.calculator.Fragmentes.Triangle_Fragments;

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


public class Triangle_circumference_Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_triangle_circumference_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText triangle_rib1  = view.findViewById(R.id.triangle_rib1);
        EditText  triangle_rib2  = view.findViewById(R.id.triangle_rib2);
        EditText  triangle_rib3  = view.findViewById(R.id.triangle_rib3);
        Button calculate_circumference_calc_btn = view.findViewById(R.id.triangle_btn_calculate_circumference);
        TextView triangle_circumference_result = view.findViewById(R.id.triangle_result_circumference);

        calculate_circumference_calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  st_rib1 =triangle_rib1.getText().toString();
                String  st_rib2 = triangle_rib2.getText().toString();
                String  st_rib3 = triangle_rib3.getText().toString();
                if(!st_rib1.isEmpty() || !st_rib2.isEmpty()  || !st_rib3.isEmpty()) {
                    double  t_rib1 = Double.parseDouble(triangle_rib1.getText().toString());
                    double  t_rib2 = Double.parseDouble(triangle_rib2.getText().toString());
                    double  t_rib3 = Double.parseDouble(triangle_rib3.getText().toString());
                    double t_last_res = (t_rib1 + t_rib2 + t_rib3);
                    int  t_res2 = (int) t_last_res;
                    if (t_res2 == t_last_res){
                        triangle_circumference_result.setText(String.valueOf(t_res2));
                    }else {
                        triangle_circumference_result.setText(String.valueOf(t_last_res));
                    }
                }else {
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }



            }
        });




    }
}