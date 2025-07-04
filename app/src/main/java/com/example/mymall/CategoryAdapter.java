package com.example.mymall;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

        public CategoryAdapter(List<CategoryModel> categoryModelList) {
                this.categoryModelList = categoryModelList;
        }

        private List<CategoryModel>categoryModelList;

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
                return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder viewHolder, int position) {
                String icon = categoryModelList.get(position).getCategoryIconLink();
                String name = categoryModelList.get(position).getCategoryName();
                viewHolder.setCategory(name,position);
        }

        @Override
        public int getItemCount() {
                return categoryModelList.size();
        }
        public class ViewHolder extends RecyclerView.ViewHolder{

                private ImageView categoryIcon;
                private TextView categoryName;
                public ViewHolder(@NonNull View itemView) {
                        super(itemView);
                        categoryIcon=itemView.findViewById(R.id.category_icon);
                        categoryName=itemView.findViewById(R.id.category_name);
                }
                private void setCategoryIcon(){

                }
                private void setCategory(String name,int position){

                        categoryName.setText(name);
                        itemView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                        if(position!=0){
                                        Intent categoryIntent =new Intent(itemView.getContext(),CategoryActivity.class);
                                        categoryIntent.putExtra("CategoryName",name);
                                        itemView.getContext().startActivity(categoryIntent);
                                }
                                }
                        });
                }
        }

}
