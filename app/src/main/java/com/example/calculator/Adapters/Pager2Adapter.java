package com.example.calculator.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.calculator.Fragmentes.Circle_Fragmets.Circle_Fragmet;
import com.example.calculator.Fragmentes.Rectangle_Fragments.Rectangle_fragment;
import com.example.calculator.Fragmentes.square_Fargments.Square_Fragment;
import com.example.calculator.Fragmentes.Triangle_Fragments.Triangle_Fragment;

public class Pager2Adapter extends FragmentStateAdapter {
    public Pager2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
        switch (i){
            case 0 :
                return new Triangle_Fragment();
            case 1 :
                return new Square_Fragment() ;
            case 2 :
                return new Rectangle_fragment() ;
            case 3 :
                return new Circle_Fragmet() ;
            default:
                return new Triangle_Fragment() ;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
