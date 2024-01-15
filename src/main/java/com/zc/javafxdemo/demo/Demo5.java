package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * Platform类使用
 *
 * @author zc
 * @date 2024/01/15
 */
public class Demo5 extends Application {
    /**
     * 开始
     *
     * @param primaryStage 初级阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 查看两个位置代码运行的线程
        System.out.println("start: " + Thread.currentThread().getName());
        Platform.runLater(() -> System.out.println("runLater: " + Thread.currentThread().getName()));


        primaryStage.setTitle("JavaFX");
        primaryStage.show();
        // 判断是否支持3D
        System.out.println("是否支持3D:" + Platform.isSupported(ConditionalFeature.SCENE3D));
        // 设置JavaFX程序不会随着主窗口的关闭而关闭
        Platform.setImplicitExit(false);
        // 退出JavaFX程序
        Platform.exit();
    }

    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
