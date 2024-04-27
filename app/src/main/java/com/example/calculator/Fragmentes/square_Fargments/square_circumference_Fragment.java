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


public class square_circumference_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_square_circumference_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button circumference_btn = view.findViewById(R.id.square_btn_calculate_circumference);
        EditText square_rib = view.findViewById(R.id.square_rib);
        TextView square_result = view.findViewById(R.id.square_result_circumference);

        circumference_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss_rib=square_rib.getText().toString();

                if(!ss_rib .isEmpty()){
                    double s_rib= Double.parseDouble(square_rib.getText().toString());

                    double last_res =( s_rib * 4);
                    int res2 = (int) last_res;

                    if (res2 == last_res){
                        square_result.setText(String.valueOf(res2));
                    }else {
                        square_result.setText(String.valueOf(last_res));
                    }
                }else  {
                    Toast.makeText(getContext(), "Please Full All Of Boxes", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}