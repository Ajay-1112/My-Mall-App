package com.example.mymall;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridSponsoredProductLayoutAdapter extends BaseAdapter {

    List<HorizontalProductScrollModel> horizontalProductScrollModelList2;

    public GridSponsoredProductLayoutAdapter(List<HorizontalProductScrollModel> horizontalProductScrollModelList) {
        this.horizontalProductScrollModelList2 = horizontalProductScrollModelList;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view ;
        if (convertView==null){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll_item_layout,null);
            view.setElevation(0);
            view.setBackgroundColor(Color.parseColor("#ffffff"));
            ImageView productImage =view.findViewById(R.id.h_s_product_img);
            TextView productDescription=view.findViewById(R.id.h_s_product_description);
            TextView productPrice=view.findViewById(R.id.h_s_product_price);
            TextView productTitle=view.findViewById(R.id.h_s_product_title);

            productImage.setImageResource(horizontalProductScrollModelList2.get(position).getProductImage());
            productTitle.setText(horizontalProductScrollModelList2.get(position).getProductTitle());
            productPrice.setText(horizontalProductScrollModelList2.get(position).getProductPrice());
            productDescription.setText(horizontalProductScrollModelList2.get(position).getProductDescription());
        }else {
            view=convertView;
        }

        return view;
    }
}
