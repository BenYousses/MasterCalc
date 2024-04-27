package com.example.calculator.Adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calculator.Databases.Entities.Operation_en;
import com.example.calculator.R;

import java.util.ArrayList;
import java.util.List;

public class Operation_Adapter extends RecyclerView.Adapter<Operation_Adapter.operation_Custom> {
List<Operation_en> operation_list = new ArrayList<>();


    public void setOperation_list(List<Operation_en> operation_list) {
        this.operation_list = operation_list;
        notifyDataSetChanged();

    }

    public Operation_Adapter() {

    }

    @NonNull
    @Override
    public operation_Custom onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       return  new operation_Custom(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.operatin_custom , null , false));
    }

    @Override
    public void onBindViewHolder(@NonNull operation_Custom operationCustom, int i) {
        Operation_en op_cac = operation_list.get(i);
        operationCustom.op_img.setImageResource(R.drawable.simple_logo);
        operationCustom.op_tv.setText(op_cac.getOperation() + " = " + " " + op_cac.getResult());
    }

    @Override
    public int getItemCount() {
        return operation_list.size();
    }

    class operation_Custom extends RecyclerView.ViewHolder{
ImageView op_img ;
TextView op_tv ;
        public operation_Custom(@NonNull View itemView) {
            super(itemView);
            op_img = itemView.findViewById(R.id.operation_img);
            op_tv = itemView.findViewById(R.id.tv_proces);
        }
    }

    }
