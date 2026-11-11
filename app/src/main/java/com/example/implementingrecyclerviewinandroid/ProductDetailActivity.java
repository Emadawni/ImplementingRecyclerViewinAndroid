package com.example.implementingrecyclerviewinandroid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);


        String passedTitle = getIntent().getStringExtra("PRODUCT_TITLE");

        android.widget.Toast.makeText(this,  passedTitle, android.widget.Toast.LENGTH_SHORT).show();
    }
}