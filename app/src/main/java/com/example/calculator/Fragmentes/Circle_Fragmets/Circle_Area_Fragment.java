package com.example.calculator.Fragmentes.Circle_Fragmets;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.R;


public class Circle_Area_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_circle__area_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button c_area_btn = view.findViewById(R.id.circle_btn_calculate_area);
        EditText cirle_diameter = view.findViewById(R.id.cirle_diameter);
        TextView circle_result = view.findViewById(R.id.circle_result_area);

        c_area_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String ss_rib= cirle_diameter.getText().toString();

                if (!ss_rib.isEmpty()){
                    double s_rib= Double.parseDouble(ss_rib);
                    double last_res = Math.pow(s_rib ,2) *3.14;
                    int res2 = (int) last_res;

                    if (res2 == last_res){
                        circle_result.setText(String.valueOf(res2));
                    }else {
                        circle_result.setText(String.valueOf(last_res));
                    }
                }else {
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}