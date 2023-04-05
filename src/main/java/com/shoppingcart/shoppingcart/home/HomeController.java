package com.shoppingcart.shoppingcart.home;


import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class HomeController {
  @FXML
    private GridPane productGridPane;
    @FXML
    public void initialize(){
        productGridPane.getChildren().clear();

VBox productView1 = productView(Product.NOBLE);

        Label label1 = new Label(Product.NOBLE.name());
        label1.setPadding(new Insets(5,5,5,5));
        productGridPane.add(productView1, 0,0);

        VBox productView2 = productView(Product.OVERLORD);

        Label label2 = new Label(Product.OVERLORD.name());
        label1.setPadding(new Insets(5,5,5,5));
        productGridPane.add(productView2, 1,0);

        VBox productView3 = productView(Product.ULTRA);

        Label label3 = new Label(Product.ULTRA.name());
        label1.setPadding(new Insets(5,5,5,5));
        productGridPane.add(productView3, 2,0);


    }

private VBox productView(Product product){
        VBox layout = new VBox();
       layout.setAlignment(Pos.CENTER);

    FileInputStream input = null;
    try {
        input = new FileInputStream("src/main/resources/image.png" + product.getImageFile());
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }

    Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        Label productName = new Label(product.name());
        Label price = new Label(product.getPrice()+ "$");

        Button addButton = new Button("Add to Cart");

        layout.getChildren().addAll(imageView, productName, price, addButton);
        return layout;

}
}
