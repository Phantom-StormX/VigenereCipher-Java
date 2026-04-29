module com.phantomstormx.vigenerecipherjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.phantomstormx.vigenerecipherjava to javafx.fxml;
    exports com.phantomstormx.vigenerecipherjava;
}