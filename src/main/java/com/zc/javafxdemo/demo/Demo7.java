package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

/**
 * Scene类
 *
 * @author zc
 * @date 2024/01/17
 */
public class Demo7  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //窗口结构 scene类基本使用
        //创建一个按钮
        Button button = new Button("按钮");
        //设置按钮的宽高
        button.setPrefWidth(50);
        //设置按钮的宽高
        button.setPrefHeight(30);
        //创建一个组
        Group group = new Group();
        //将按钮添加到组中
        group.getChildren().add(button);
        //创建一个场景
        Scene scene = new Scene(group);
        scene.setCursor(Cursor.HAND);
        //获取图片的路径
        URL resource = getClass().getResource("/com/zc/javafxdemo/demo/images/aigeico.png");
        //将图片的路径转换为字符串
        String cursor = Objects.requireNonNull(resource).toExternalForm();
        //用图片设置鼠标样式
        scene.setCursor(Cursor.cursor(cursor));

        //获取主机服务
        HostServices hostServices = getHostServices();
        //打开一个网页 并主机服务绑定在按钮上
        button.setOnAction(event -> hostServices.showDocument("http://www.baidu.com"));

        //将场景添加到窗口
        primaryStage.setScene(scene);
        //设置窗口的标题
        primaryStage.setTitle("JavaFX");
        //设置窗口的宽
        primaryStage.setWidth(500);
        //设置窗口的高
        primaryStage.setHeight(500);
        //显示窗口
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
