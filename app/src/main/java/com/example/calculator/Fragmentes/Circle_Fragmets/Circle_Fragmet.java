package com.example.calculator.Fragmentes.Circle_Fragmets;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculator.Adapters.Circle_Adapter.CircleAdapter;
import com.example.calculator.Adapters.RectangleAdapter.Rectangle_Adapter;
import com.example.calculator.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class Circle_Fragmet extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_circle__fragmet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager2  circle_viewPager = view.findViewById(R.id.circle_ViwPager);
        TabLayout circle_tablayout = view.findViewById(R.id.circle_tabLyout);
circle_viewPager.setAdapter(new CircleAdapter(getActivity()));
        TabLayoutMediator tabLayoutMediator =  new TabLayoutMediator(circle_tablayout, circle_viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch(i){
                    case 0 :{
                        tab.setText("المساحة");
                        break;
                    }
                    case 1 :{
                        tab.setText("المحيط");
                        break;
                    }
                }
            }
        });
        tabLayoutMediator.attach();
    }
}