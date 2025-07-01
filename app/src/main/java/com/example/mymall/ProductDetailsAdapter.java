package com.example.mymall;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ProductDetailsAdapter extends FragmentStateAdapter {
    private int totalTabs;
    public ProductDetailsAdapter(@NonNull Fragment fragment,int totalTabs) {
        super(fragment);
        this.totalTabs=totalTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position){
           case 0:
               ProductDescriptionFragment productDescriptionFragment1 =new ProductDescriptionFragment();
               return productDescriptionFragment1;
           case 1:
               ProductSpecificationFragment productSpecificationFragment=new ProductSpecificationFragment();
               return productSpecificationFragment;
           case 2:
               ProductDescriptionFragment productDescriptionFragment2 =new ProductDescriptionFragment();
               return productDescriptionFragment2;
           default:
               return null;

       }
    }

    @Override
    public int getItemCount() {
        return totalTabs;
    }
}