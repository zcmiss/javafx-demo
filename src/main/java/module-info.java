module com.zc.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zc.javafxdemo to javafx.fxml;
}