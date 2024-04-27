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


public class Triangle_Area_Fragment extends Fragment {


    public Triangle_Area_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_triangle__area_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText  triaglre_base  = view.findViewById(R.id.triangle_base);
        EditText  triaglre_height  = view.findViewById(R.id.triangle_height);
        Button calculate_area_calc_btn = view.findViewById(R.id.triangle_btn_calculate_area);
        TextView   triangle_ara_rsult = view.findViewById(R.id.triangle_result_area);

        calculate_area_calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String striangle_base_data = triaglre_base.getText().toString();
                String  striangle_height_data = triaglre_height.getText().toString();

                if  (!striangle_base_data.isEmpty() || !striangle_height_data.isEmpty()){
                    double triangle_base_data = Double.parseDouble(triaglre_base.getText().toString());
                    double triangle_height_data = Double.parseDouble(triaglre_height.getText().toString());
                    double res1  = triangle_base_data * triangle_height_data;
                    double triangle_last_res = (res1  * 0.5);
                    int  triangle_res2 = (int) triangle_last_res ;
                    if (triangle_res2 == triangle_res2){
                        triangle_ara_rsult.setText(String.valueOf(triangle_res2));
                    }else {
                        triangle_ara_rsult.setText(String.valueOf(triangle_last_res));
                    }
                }else {
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}