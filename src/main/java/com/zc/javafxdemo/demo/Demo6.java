package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;


/**
 * Screen类
 *
 * @author zc
 * @date 2024/01/15
 */
public class Demo6 extends Application {
    /**
     * 开始
     *
     * @param primaryStage 初级阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 获取全部屏幕宽高和坐标
        Rectangle2D rec = Screen.getPrimary().getBounds();
        System.out.println("left up x: " + rec.getMinX());
        System.out.println("left up y: " + rec.getMinY());
        System.out.println("right down x: " + rec.getMaxX());
        System.out.println("right down y: " + rec.getMaxY());
        System.out.println("width: " + rec.getWidth());
        System.out.println("height: " + rec.getHeight());

        // 获取可以看到屏幕宽高和坐标
        Rectangle2D rec2 = Screen.getPrimary().getVisualBounds();
        System.out.println("left up x: " + rec2.getMinX());
        System.out.println("left up y: " + rec2.getMinY());
        System.out.println("right down x: " + rec2.getMaxX());
        System.out.println("right down y: " + rec2.getMaxY());
        System.out.println("width: " + rec2.getWidth());
        System.out.println("height: " + rec2.getHeight());
        primaryStage.show();
        // 获取DPI
        System.out.println(Screen.getPrimary().getDpi());
    }

    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
