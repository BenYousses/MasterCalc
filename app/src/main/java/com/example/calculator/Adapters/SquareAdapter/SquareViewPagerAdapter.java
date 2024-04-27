package com.example.calculator.Adapters.SquareAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.calculator.Fragmentes.square_Fargments.Square_Area_Fragment;
import com.example.calculator.Fragmentes.square_Fargments.square_circumference_Fragment;

public class SquareViewPagerAdapter extends FragmentStateAdapter {
    public SquareViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
      switch (i){
          case 0 :
              return new Square_Area_Fragment() ;
          case 1 :
              return new square_circumference_Fragment();
          default:
              return new Square_Area_Fragment();
      }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
