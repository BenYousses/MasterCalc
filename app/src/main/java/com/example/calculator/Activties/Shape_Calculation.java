package com.example.calculator.Activties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.os.Bundle;

import com.example.calculator.Adapters.Pager2Adapter;
import com.example.calculator.R;
import com.example.calculator.databinding.ActivityShapeCalculationBinding;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Shape_Calculation extends AppCompatActivity {
ActivityShapeCalculationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShapeCalculationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





        binding.viewpager2.setAdapter(new Pager2Adapter(this));
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLyout, binding.viewpager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch (i){
                    case 0 : {
                        tab.setText("Triangle");
                        tab.setIcon(R.drawable.triangle_icon);
                        break;
                    }
                    case 1 : {
                        tab.setText("Square");
                        tab.setIcon(R.drawable.square_icon);
                        break;
                    } case 2: {
                        tab.setText("Rectangle");
                        tab.setIcon(R.drawable.rectangle_icon);
                        break;
                    }
                    case 3 : {
                        tab.setText("circle");
                        tab.setIcon(R.drawable.circle_icon);
                        break;
                    }
                }
            }
        }
        );
tabLayoutMediator.attach();
    }
}