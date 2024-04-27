package com.example.calculator.Adapters.RectangleAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.calculator.Fragmentes.Rectangle_Fragments.Rectangle_Area_Fragment;
import com.example.calculator.Fragmentes.Rectangle_Fragments.Rectangle_circumference_Fragment;

public class Rectangle_Adapter extends FragmentStateAdapter {
    public Rectangle_Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
        switch(i){
            case 0:
                return new Rectangle_Area_Fragment();
            case 1 :
                return new Rectangle_circumference_Fragment();
            default:
                return new Rectangle_Area_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
