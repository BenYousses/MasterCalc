package com.example.calculator.Fragmentes.square_Fargments;

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

import org.w3c.dom.Text;

public class Square_Area_Fragment extends Fragment {


    public Square_Area_Fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_square__area_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button Area_btn = view.findViewById(R.id.square_btn_calculate_area);
        EditText square_width = view.findViewById(R.id.square_width);
        EditText square_height = view.findViewById(R.id.square_height);
        TextView square_result = view.findViewById(R.id.square_result_area);

        Area_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss_width =square_width.getText().toString();

                String ss_height = square_height.getText().toString();
                if(!ss_height.isEmpty() || !ss_width.isEmpty()){
                    double s_width = Double.parseDouble(square_width.getText().toString());
                    double s_height = Double.parseDouble(square_height.getText().toString());
                    double res = (s_width * s_height);
                    int res1 = (int) res;
                    if (res == res1){
                        square_result.setText(String.valueOf(res1));
                    }else {
                        square_result.setText(String.valueOf(res));
                    }
                }else {
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}