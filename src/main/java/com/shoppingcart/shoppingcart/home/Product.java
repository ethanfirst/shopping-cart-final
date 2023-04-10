package com.shoppingcart.shoppingcart.home;

public enum Product {
    CHOCOLATE_CHIP_COOKIE("cookie.png", 1.55f), BANANA_BREAD("Banana+Loaf+Slice.png", 2.25f), BLONDIES("Blondies.png", 1.75f);

    private String imageFile;
    private float price;
    private Product(String image, float price){

        this.imageFile = image;
        this.price = price;
    }
    public String getImageFile(){
        return imageFile;
    }
    public float getPrice(){
        return this.price;
    }
}