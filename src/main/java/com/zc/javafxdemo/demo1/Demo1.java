package com.zc.javafxdemo.demo1;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * demo1
 * JavaFX入门程序
 *
 * @author zc
 * @date 2024/01/15
 */
public class Demo1 extends Application {
    /**
     * 重写start方法
     */
    @Override
    public void start(Stage stage) throws Exception {
        // 设置标题
        stage.setTitle("The first JavaFx Application");
        // 显示窗口
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
