module com.shoppingcart.shoppingcart {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.shoppingcart.shoppingcart to javafx.fxml;
    exports com.shoppingcart.shoppingcart;
}