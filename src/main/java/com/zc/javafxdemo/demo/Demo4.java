package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Stage窗口（续）
 *
 * @author zc
 * @date 2024/01/15
 */
public class Demo4 extends Application {
    /**
     * 开始
     *
     * @param stage 阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage stage) throws Exception {
        // 距离屏幕左上角距离
        stage.setX(100);
        stage.setY(100);
        // 设置宽
        stage.setWidth(250);
        // 设置高
        stage.setHeight(250);

        // 默认样式
        stage.initStyle(StageStyle.DECORATED);
        // 显示窗口
        stage.show();
        // 监听窗口移动
        stage.xProperty().addListener((observableValue, number, t1) -> System.out.println("当前窗口X轴坐标：" + t1.doubleValue()));
        stage.yProperty().addListener((observableValue, number, t1) -> System.out.println("当前窗口Y轴坐标：" + t1.doubleValue()));

        // 透明样式
        Stage stage1 = new Stage();
        stage1.initStyle(StageStyle.TRANSPARENT);
        // 显示窗口
        stage1.show();

        // 纯白色背景，没有装饰
        Stage stage2 = new Stage();
        stage2.initStyle(StageStyle.UNDECORATED);
        // 设置模态窗口，设置后如果该窗口不关闭则不能点击其他窗口
        stage2.initModality(Modality.APPLICATION_MODAL);
        // 设置父窗口
        stage2.initOwner(stage);
        // 设置模态窗口，该窗口没有关闭前点击stage（即父窗口）窗口无效
        stage2.initModality(Modality.WINDOW_MODAL);
        // 显示窗口
        stage2.show();

        Stage stage3 = new Stage();
        // 定义具有纯白色背景和用于实用程序窗口的最小平台装饰的Stage样式。
        stage3.initStyle(StageStyle.UTILITY);
        // 显示窗口
        stage3.show();

        Stage stage4 = new Stage();
        // 用平台装饰定义Stage风格，消除客户区和装饰之间的边界。客户区背景与装饰统一。
        stage4.initStyle(StageStyle.UNIFIED);
        // 显示窗口
        stage4.show();
    }

    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
