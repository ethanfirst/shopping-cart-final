package com.shoppingcart.shoppingcart.home;


import com.shoppingcart.shoppingcart.cart.ShoppingCart;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
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
    public void initialize() throws FileNotFoundException {

        productGridPane.getChildren().clear();
        System.out.println(Product.CHOCOLATE_CHIP_COOKIE.getImageFile());

        VBox productView1 = productView(Product.CHOCOLATE_CHIP_COOKIE);

        Label label1 = new Label(Product.CHOCOLATE_CHIP_COOKIE.name());
        label1.setPadding(new Insets(5,5,5,5));
        productGridPane.add(productView1, 0,0);

        VBox productView2 = productView(Product.BANANA_BREAD);

        Label label2 = new Label(Product.BANANA_BREAD.name());
        label2.setPadding(new Insets(5,5,5,5));
        productGridPane.add(productView2, 1,0);

        VBox productView3 = productView(Product.BLONDIES);

        Label label3 = new Label(Product.BLONDIES.name());
        label3.setPadding(new Insets(5,5,5,5));
        productGridPane.add(productView3, 2,0);


    }

private VBox productView(Product product) throws FileNotFoundException{
        VBox layout = new VBox();
       layout.setAlignment(Pos.CENTER);

    FileInputStream input = new FileInputStream("src/main/resources/" + product.getImageFile());



    Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        Label productName = new Label(product.name());
    String strProductName = productName.getText();
        Label price = new Label(product.getPrice()+ "$");

        Button addButton = new Button("Add to Cart");
        addButton.setUserData(strProductName);
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               Node sourceComponent = (Node)actionEvent.getSource();
               String productName = (String)sourceComponent.getUserData();
                ShoppingCart shoppingCart = ShoppingCart.getInstance();
                shoppingCart.addProduct(productName);
            }
        });
        layout.getChildren().addAll(imageView, productName, price, addButton);
        return layout;

}
}
