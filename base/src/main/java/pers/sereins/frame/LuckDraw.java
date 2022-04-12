package pers.sereins.frame;

import javax.swing.*;

public class LuckDraw extends JFrame {

    public static void main(String[] args) {
        new LuckDraw();
    }

    public LuckDraw()
    {
        // 标题
        setTitle("抽奖");
        // 大小
        setSize(400,200);
        // 置窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口是否可见
        setVisible(true);
    }
}
