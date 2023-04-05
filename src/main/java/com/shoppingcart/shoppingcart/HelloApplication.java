package com.shoppingcart.shoppingcart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {

    public static Stage window;
    @Override
    public void start(Stage stage) throws IOException {
        URL url = new File("C:/Users/user/IdeaProjects/shopping-cart/src/main/java/com/shoppingcart/shoppingcart/cart-ui.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage.setTitle("Shopping Cart");
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(new Scene(root, Color.TRANSPARENT));
        stage.show();
        window = stage;
    }

    public static void main(String[] args) {
        launch();

    }
    public static Stage getWindow(){
        return window;
    }
}