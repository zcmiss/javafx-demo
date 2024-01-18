package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Button按钮事件触发
 *
 * @author zc
 * @date 2024/01/18
 */
public class Demo10 extends Application {
    /**
     * 开始
     *
     * @param primaryStage 初级阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //鼠标点击事件
        Button button = new Button("按钮");
        // 按钮位置
        button.setLayoutX(50);
        button.setLayoutY(50);
        // 按钮宽高
        button.setPrefWidth(50);
        button.setPrefHeight(30);
        // 鼠标点击事件
        mouseClickEvents(button);
        //键盘按下事件
        keyboardPressEvent(button);
        // 键盘释放事件
        keyboardReleaseEvent(button);
        // 设置组件与场景
        Scene scene = new Scene(new Group(button));
        // 设置场景与舞台
        primaryStage.setScene(scene);
        // 设置舞台标题
        primaryStage.setTitle("JavaFX");
        // 设置舞台大小
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        // 显示舞台
        primaryStage.show();
    }



    /**
     * 键盘按下事件
     *
     * @param button 按钮
     */
    private static void keyboardPressEvent(Button button) {
        button.setOnKeyPressed(event -> {
            // 获取按下的键
            KeyCode code = event.getCode();
            System.out.println("按键：" + code.name());
            // 判断按下的键
            if (code.equals(KeyCode.ENTER)) {
                System.out.println("按下了回车键");
            }
        });
    }
    /**
     * 键盘释放事件
     *
     * @param button 按钮
     */
    private static void keyboardReleaseEvent(Button button) {
        button.setOnKeyReleased(event -> {
            // 获取释放的键
            KeyCode code = event.getCode();
            System.out.println("释放的按键：" + code.name());
        });
    }
    /**
     * 鼠标单击事件
     *
     * @param button 按钮
     */
    private static void mouseClickEvents(Button button) {
        // 设置按钮的鼠标点击事件
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            System.out.println("鼠标单击事件");
            // 判断鼠标点击次数
            if (event.getClickCount() == 2) {
                System.out.println("鼠标双击事件");
            }
        });
    }

    /**
     * 主要
     *
     * @param args args
     */
    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
