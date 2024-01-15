package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

/**
 * Stage窗口
 *
 * @author zc
 * @date 2024/01/15
 */
public class Demo3 extends Application {
    /**
     * 开始
     *
     * @param stage 阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage stage) throws Exception {
        // 设置标题
        stage.setTitle("The first JavaFx Application");
        // 设置宽
        stage.setWidth(250);
        // 设置高
        stage.setHeight(250);
        // 设置最大高
        stage.setMaxHeight(500);
        // 设置最大宽
        stage.setMaxWidth(500);
        // 设置最小高
        stage.setMinHeight(100);
        // 设置最小宽
        stage.setMinWidth(100);
        // 如果没用设置宽高，则以下两个方法必须在show()方法执行才能获取宽高
        stage.getWidth();
        stage.getHeight();
        // 显示窗口
        stage.show();
        // 根据标题获取窗口高度
        stage.heightProperty().addListener((observableValue, number, t1) -> {
            System.out.println("当前窗口高度变化：" + t1.doubleValue());
        });
        // 根据标题获取窗口宽度
        stage.widthProperty().addListener((observableValue, number, t1) -> {
            System.out.println("当前窗口宽度变化：" + t1.doubleValue());
        });
    }

    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
