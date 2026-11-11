package com.example.implementingrecyclerviewinandroid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        productList = new ArrayList<>();
        productList = new ArrayList<>();
        productList.add(new Product("Photo Studio Box", "US$48.89", R.drawable.item1));
        productList.add(new Product("Galaxy Z Flip", "US$250.00", R.drawable.item2));
        productList.add(new Product("Smartphones", "US$78.89", R.drawable.item3));
        productList.add(new Product("Skincare Serum", "US$88.55", R.drawable.item4));
        productList.add(new Product("Wireless Earbuds", "US$23.67", R.drawable.item5));
        productList.add(new Product("Tripod Ball Head", "US$44.89", R.drawable.item6));

        adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}