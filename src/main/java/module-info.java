module com.zc.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zc.javafxdemo to javafx.fxml;
    exports com.zc.javafxdemo;
    exports com.zc.javafxdemo.demo1;
    opens com.zc.javafxdemo.demo1 to javafx.fxml;
}