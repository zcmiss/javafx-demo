package com.zc.javafxdemo.demo;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * Group容器的使用
 *
 * @author zc
 * @date 2024/01/17
 */
public class Demo8 extends Application {
    /**
     * 开始
     *
     * @param primaryStage 初级阶段
     * @throws Exception 例外
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Group容器中添加删除按钮
        Button button0 = new Button("删除");
        button0.setLayoutX(400);
        button0.setLayoutY(100);

        // Group容器中添加新增组件按钮
        Button button = new Button("新增");
        button.setLayoutX(500);
        button.setLayoutY(100);

        // 设置三个按钮
        Button button1 = new Button("按钮1");
        // 设置按钮在布局中的位置
        button1.setLayoutX(100);
        button1.setLayoutY(100);

        Button button2 = new Button("按钮2");
        // 设置按钮在布局中的位置
        button2.setLayoutX(200);
        button2.setLayoutY(100);

        Button button3 = new Button("按钮3");
        // 设置按钮在布局中的位置
        button3.setLayoutX(300);
        button3.setLayoutY(100);

        // 创建一个组
        Group group = new Group();
        // 将按钮添加到组中
        group.getChildren().addAll(button1, button2, button3, button0, button);
        // 移除按钮1
        //group.getChildren().remove(button1);
        // 移除所有组件
        //group.getChildren().clear();
        // 不设置组件默认宽高
        //group.setAutoSizeChildren(false);

        // 创建一个场景
        Scene scene = new Scene(group);
        // 将场景添加到窗口
        primaryStage.setScene(scene);

        // 设置场景的宽度
        primaryStage.setWidth(800);
        // 设置场景的高度
        primaryStage.setHeight(500);
        // 显示窗口
        primaryStage.show();

        // 键盘按下事件
        keyboardPressEvent(button1);

        // 键盘释放事件
        keyboardReleaseEvent(button2);

        // 父组件的设置会影响子组件
        //group.setOpacity(0.5);
        // 查询组件是否包含某个坐标点
        System.out.println(group.contains(100, 100));
        // group 中所有节点转为数组
        Object[] groupArray = group.getChildren().toArray();
        Arrays.stream(groupArray).forEach(System.out::println);

        // 监听group中节点数量的改变
        group.getChildren().addListener((ListChangeListener<Node>) change -> System.out.println(change.getList().size()));

        // 绑定删除事件
        button0.setOnAction(event -> {
            group.getChildren().remove(button1);
            group.getChildren().remove(button2);
            group.getChildren().remove(button3);
        });
        // 删除所有组件
        //button.setOnAction(event -> group.getChildren().clear());

        // 绑定添加所有组件
        button.setOnAction(event -> group.getChildren().addAll(button1, button2, button3));


    }

    /**
     * 键盘释放事件
     *
     * @param button2 按钮2
     */
    private static void keyboardReleaseEvent(Button button2) {
        button2.setOnKeyPressed(event -> {
            System.out.println("键盘释放：" + event.getCode().name());
            switch (event.getCode()) {
                case UP:
                    System.out.println("释放的是向上键");
                    break;
                case DOWN:
                    System.out.println("释放的是向下键");
                    break;
                case LEFT:
                    System.out.println("释放的是向左键");
                    break;
                case RIGHT:
                    System.out.println("释放的是向右键");
                    break;
                default:
                    System.out.println("释放的是其他键");
                    break;
            }
        });
    }

    /**
     * 键盘按下事件
     *
     * @param button1 按钮1
     */
    private static void keyboardPressEvent(Button button1) {
        // 键盘按下事件，如果按下键盘不松开，则会一直触发事件
        button1.setOnKeyPressed(event -> {
            System.out.println("键盘按下：" + event.getCode().name());
            switch (event.getCode()) {
                case UP:
                    System.out.println("按下的是向上键");
                    break;
                case DOWN:
                    System.out.println("按下的是向下键");
                    break;
                case LEFT:
                    System.out.println("按下的是向左键");
                    break;
                case RIGHT:
                    System.out.println("按下的是向右键");
                    break;
                default:
                    System.out.println("按下的是其他键");
                    break;
            }
        });
    }

    public static void main(String[] args) {
        // 启动JavaFX程序
        launch(args);
    }
}
