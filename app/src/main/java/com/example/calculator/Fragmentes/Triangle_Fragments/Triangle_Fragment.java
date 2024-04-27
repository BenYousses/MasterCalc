package com.example.calculator.Fragmentes.Triangle_Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculator.Adapters.Triangle_Adapter.TriangleViewPagerAdapter;
import com.example.calculator.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class Triangle_Fragment extends Fragment {


    public Triangle_Fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_triangle_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager2 viewPager_trinagle = view.findViewById(R.id.triangle_ViwPager);
        TabLayout tabLayout_triangle = view.findViewById(R.id.triangle_tabLyout);
        viewPager_trinagle.setAdapter(new TriangleViewPagerAdapter(getActivity()));
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout_triangle,viewPager_trinagle, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch (i){
                    case 0 : {
                        tab.setText("المساحة");
                        break;
                    }
                    case 1 : {
                        tab.setText("المحيط");

                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();

    }
}