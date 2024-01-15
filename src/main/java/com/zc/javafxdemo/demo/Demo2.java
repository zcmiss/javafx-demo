package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 启动图形界面的三种方式
 *
 * @author zc
 * @date 2024/01/15
 */
public class Demo2 extends Application {
    public static void main(String[] args) {
        // 获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println("main: " + currentThread.getName());
        // 启动JavaFX程序
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println("start: " + currentThread.getName());
        stage.setTitle("Launch类");
        stage.show();
    }


    /**
     * 初始化
     *
     * @throws Exception 例外
     */
    @Override
    public void init() throws Exception {
        // 获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println("init: " + currentThread.getName());
    }

    /**
     * 停止
     *
     * @throws Exception 例外
     */
    @Override
    public void stop() throws Exception {
        // 获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println("stop: " + currentThread.getName());
    }
}
