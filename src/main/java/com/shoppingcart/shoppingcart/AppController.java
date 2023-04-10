package com.shoppingcart.shoppingcart;


import com.shoppingcart.shoppingcart.cart.CartView;

import com.shoppingcart.shoppingcart.home.HomeView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;



public class AppController {


    @FXML
    BorderPane contentPane;

    public void closeApp(){
        HelloApplication.getWindow().close();
   }

    public void showHomeView() throws IOException{
        contentPane.setCenter(new HomeView().getView());


    }

    public void showCartView() throws IOException {
        contentPane.setCenter(new CartView().getView());
    }




}