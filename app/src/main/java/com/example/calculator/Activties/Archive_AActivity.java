package com.example.calculator.Activties;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.calculator.Adapters.Operation_Adapter;

import com.example.calculator.Databases.Entities.MyViewModel;
import com.example.calculator.Databases.Entities.Operation_en;
import com.example.calculator.databinding.ActivityArchiveAactivityBinding;

import java.util.ArrayList;
import java.util.List;

public class Archive_AActivity extends AppCompatActivity {
ActivityArchiveAactivityBinding  binding ;
Operation_Adapter adapter ;
MyViewModel mvm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArchiveAactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //  inflate "ViewModel"
        mvm = new ViewModelProvider(this).get(MyViewModel.class);
        //ifalate 'Addater'
        adapter = new Operation_Adapter();
        // ReyclerView Setting
        binding.ArchiveRv.setAdapter(adapter);
        binding.ArchiveRv.setHasFixedSize(true);
        binding.ArchiveRv.setLayoutManager(new LinearLayoutManager(this));
// get All From  Roomdatabase
        mvm.getAllOperation().observe(this, new Observer<List<Operation_en>>() {
            @Override
            public void onChanged(List<Operation_en> operationEns) {
                  adapter.setOperation_list(operationEns);
            }
        });

       binding.deleteArchiveBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               // dlete All from Room DataBase
               mvm.deleteAllOpeartion();
               Toast.makeText(Archive_AActivity.this, "Delted", Toast.LENGTH_SHORT).show();
           }
       });


    }

    }
