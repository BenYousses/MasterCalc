package com.example.calculator.Adapters.Triangle_Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.calculator.Fragmentes.Triangle_Fragments.Triangle_Area_Fragment;
import com.example.calculator.Fragmentes.Triangle_Fragments.Triangle_circumference_Fragment;

public class TriangleViewPagerAdapter extends FragmentStateAdapter {
    public TriangleViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
        switch(i){
            case 0:
                return new Triangle_Area_Fragment();
            case 1:
                return new Triangle_circumference_Fragment();
            default:
                return new Triangle_Area_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
