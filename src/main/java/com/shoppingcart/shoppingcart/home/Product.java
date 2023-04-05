package com.shoppingcart.shoppingcart.home;

public enum Product {
    NOBLE("null.jpg", 0.55f), OVERLORD("null.jpg", 1.00f), ULTRA("null.jpg", 0.70f);

    private String imageFile;
    private float price;
    private Product(String image, float price){

        this.imageFile = imageFile;
        this.price = price;
    }
    public String getImageFile(){
        return imageFile;
    }
    public float getPrice(){
        return this.price;
    }
}