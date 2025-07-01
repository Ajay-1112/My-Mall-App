package com.example.mymall.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymall.CategoryAdapter;
import com.example.mymall.CategoryModel;
import com.example.mymall.HomePageAdapter;
import com.example.mymall.HomePageModel;
import com.example.mymall.HorizontalProductScrollModel;
import com.example.mymall.R;
import com.example.mymall.SliderModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);

        categoryRecyclerView=view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        final List<CategoryModel>categoryModelList=new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link","Home"));
        categoryModelList.add(new CategoryModel("link","Electronics"));
        categoryModelList.add(new CategoryModel("link","Furniture"));
        categoryModelList.add(new CategoryModel("link","Toys"));
        categoryModelList.add(new CategoryModel("link","Sports"));
        categoryModelList.add(new CategoryModel("link","Wall Arts"));
        categoryModelList.add(new CategoryModel("link","Books"));
        categoryModelList.add(new CategoryModel("link","Phone"));
        categoryModelList.add(new CategoryModel("link","Shoes"));
        categoryModelList.add(new CategoryModel("link","Adapter"));

        categoryAdapter =new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        ////banner slider
        List<SliderModel>sliderModelList=new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.baseline_home_24,"#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.cart,"#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.baseline_person_24,"#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.logo,"#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.mymall,"#077AE4"));

        sliderModelList.add(new SliderModel(R.drawable.baseline_home_24,"#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.cart,"#077AE4"));

        sliderModelList.add(new SliderModel(R.drawable.baseline_person_24,"#077AE4"));




        //// horizontal/////


        List<HorizontalProductScrollModel> horizontalProductScrollModelList=new ArrayList<>();

        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.logo,"redmi","sd 728g","Rs 6000/-"));


        //// horizontal/////
        testing= view.findViewById(R.id.home_page_recyclerview);
        LinearLayoutManager testingLayoutManager=new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        List<HomePageModel>homePageModelList =new ArrayList<>();
        homePageModelList.add(new HomePageModel(0,sliderModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.photo,"#000000"));
        homePageModelList.add(new HomePageModel(2,"Deals of The Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Suggested For You",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(4,"Sponsored",horizontalProductScrollModelList));



        HomePageAdapter adapter=new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        return view;

    }

}