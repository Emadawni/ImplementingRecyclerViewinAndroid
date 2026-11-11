package com.example.implementingrecyclerviewinandroid;

public class Product {
    private String title;
    private String price;
    private int imageResId;

    public Product(String title, String price, int imageResId) {
        this.title = title;
        this.price = price;
        this.imageResId = imageResId;
    }

    public String getTitle() { return title; }
    public String getPrice() { return price; }
    public int getImageResId() { return imageResId; }
}