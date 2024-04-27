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


public class Rectangle_circumference_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rectangle_circumference__fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button r_circumference_btn = view.findViewById(R.id.rectangle_btn_calculate_circumference);
        EditText rectangle_rib_width = view.findViewById(R.id.rectangle_rib_widt);
        EditText rectangle_rib_height = view.findViewById(R.id.rectangle_rib_height);
        TextView rectangle_result = view.findViewById(R.id.rectangle_result_circumference);

        r_circumference_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String w_rib= rectangle_rib_width.getText().toString();
                String h_rib= rectangle_rib_height.getText().toString();

                if (!w_rib.isEmpty() || !h_rib.isEmpty()){
                    double ss_rib= Double.parseDouble(w_rib);
                    double hf_rib= Double.parseDouble(h_rib);
                    double last_res =( ss_rib + hf_rib) * 2;
                    int res2 = (int) last_res;

                    if (res2 == last_res){
                        rectangle_result.setText(String.valueOf(res2));
                    }else {
                        rectangle_result.setText(String.valueOf(last_res));
                    }
                }else {
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}