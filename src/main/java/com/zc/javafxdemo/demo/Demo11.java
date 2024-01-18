package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.stage.Stage;

/**
 * 设置快捷键
 *
 * @author zc
 * @date 2024/01/18
 */
public class Demo11 extends Application {
    /**
     * 开始
     *
     * @param primaryStage 初级阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 新建一个按钮
        Button button = new Button("按钮");
        // 设置按钮位置
        button.setLayoutX(50);
        button.setLayoutY(50);
        // 设置按钮宽高
        button.setPrefWidth(50);
        button.setPrefHeight(30);

        // 设置组件
        Group group = new Group(button);
        // 设置场景
        Scene scene = new Scene(group);


        primaryStage.setScene(scene);
        // 设置标题
        primaryStage.setTitle("JavaFX");
        // 设置宽高
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        // 显示舞台
        primaryStage.show();
        // 第一种方式：设置快捷键
        //setShortcutKeys1(button, scene);
        // 第二种方式：设置快捷键
        //setShortcutKeys2(button, scene);
        // 第三种方式：设置快捷键
        //setShortcutKeys3(scene);
        // 第四种方式：设置快捷键

    }

    /**
     * 设置快捷键3
     *
     * @param scene 场景
     */
    private static void setShortcutKeys3(Scene scene) {
        scene.getAccelerators().put(new KeyCodeCombination(KeyCode.Y, KeyCombination.ALT_DOWN), () -> {
            System.out.println("RUN");
            System.out.println(Thread.currentThread().getName());
            System.out.println("第三种方式设置快捷键按钮被点击了");
        });
    }

    /**
     * 设置快捷键2
     *
     * @param button 按钮
     * @param scene  场景
     */
    private static void setShortcutKeys2(Button button, Scene scene) {
        // KeyCharacterCombination第一个参数是主按键，后面的参数为辅助按键（可变参数）
        KeyCharacterCombination a = new KeyCharacterCombination("a", KeyCombination.CONTROL_DOWN);
        Mnemonic mnemonic1 = new Mnemonic(button, a);
        scene.addMnemonic(mnemonic1);

        scene.setOnKeyPressed(event -> {
            System.out.println("按下：" + event.getCode().name());
            if (a.match(event)) {
                System.out.println("第二种方式设置快捷键按钮被点击了");
            }
        });
    }

    /**
     * 设置快捷键1
     *
     * @param button 按钮
     * @param scene  场景
     */
    private static void setShortcutKeys1(Button button, Scene scene) {
        // KeyCodeCombination第一个参数是主按键，后面的参数为辅助按键（可变参数）
        KeyCombination keyCombination = new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN);
        Mnemonic mnemonic = new Mnemonic(button, keyCombination);
        scene.addMnemonic(mnemonic);
        scene.setOnKeyPressed(event -> {
            System.out.println("按下：" + event.getCode().name());
            if (keyCombination.match(event)) {
                System.out.println("第一种方式设置快捷键按钮被点击了");
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
