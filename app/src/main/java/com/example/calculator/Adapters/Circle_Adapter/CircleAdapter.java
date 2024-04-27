package com.example.calculator.Adapters.Circle_Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.calculator.Fragmentes.Circle_Fragmets.Circle_Area_Fragment;
import com.example.calculator.Fragmentes.Circle_Fragmets.Circle_Circumference_Fragment;

public class CircleAdapter extends FragmentStateAdapter {
    public CircleAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
switch (i){
    case  0 :
        return new Circle_Area_Fragment();
    case 1 :
        return new Circle_Circumference_Fragment();
    default:return new Circle_Area_Fragment();
}
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
