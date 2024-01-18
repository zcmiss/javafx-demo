package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Button按钮
 *
 * @author zc
 * @date 2024/01/17
 */
public class Demo9 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
         // 设置按钮的文字
        button.setText("按钮");
        // 设置按钮在布局中的位置
        button.setLayoutX(50);
        button.setLayoutY(50);
        // 设置按钮大小
        button.setPrefWidth(100);
        button.setPrefHeight(50);
        // 设置按钮的字体
        button.setFont(Font.font("宋体", 20));
        // 设置按钮颜色 圆角 内边距
        button.setBackground(new Background(new BackgroundFill(Color.BLUE,new CornerRadii(20),new Insets(10))));
        // 颜色、类型（实线）、圆角、边框大小
        button.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(20),new BorderWidths(5))));
        // 设置文本颜色
        button.setTextFill(Color.RED);
        // 设置背景颜色 圆角
        button.setStyle("-fx-background-color: #eeff00;-fx-background-radius: 20;");
        // 设置按钮鼠标单击事件
        button.setOnAction(event -> {
            Button bt = (Button) event.getSource();
                System.out.println("bt.getText() = " + bt.getText());
        });

        primaryStage.setTitle("JavaFX");
        // 设置场景
        Group group = new Group(button);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
