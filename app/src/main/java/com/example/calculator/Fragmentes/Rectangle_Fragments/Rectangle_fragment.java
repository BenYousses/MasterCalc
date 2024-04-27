package com.example.calculator.Fragmentes.Rectangle_Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculator.Adapters.RectangleAdapter.Rectangle_Adapter;
import com.example.calculator.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Rectangle_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rectangle_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager2 rectangle_viewPager = view.findViewById(R.id.rectangle_ViwPager);
        TabLayout rectangle_tablayout = view.findViewById(R.id.rectangle_tabLyout);

        rectangle_viewPager.setAdapter(new Rectangle_Adapter(getActivity()));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(rectangle_tablayout,rectangle_viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch (i){
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