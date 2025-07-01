package com.example.mymall;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String title=getIntent().getStringExtra("CategoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        categoryRecyclerView=findViewById(R.id.category_recycler_view);


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
        LinearLayoutManager testingLayoutManager=new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

        List<HomePageModel>homePageModelList =new ArrayList<>();
        homePageModelList.add(new HomePageModel(0,sliderModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.photo,"#000000"));
        homePageModelList.add(new HomePageModel(2,"Deals of The Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Suggested For You",horizontalProductScrollModelList));



        HomePageAdapter adapter=new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        int id = item.getItemId();
        if (id == R.id.main_search_icon) {
            return true;
        } else if (id==android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}