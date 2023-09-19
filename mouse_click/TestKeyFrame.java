package com.itheima.key;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//能够记录键盘的按下和放开
public class TestKeyFrame extends JFrame implements KeyListener {

    public static void main(String[] args) {
        TestKeyFrame frame = new TestKeyFrame();
        frame.init();
    }

    public void init() {
        setSize(514, 538); // 设置宽高
        setLocationRelativeTo(null);    // 设置居中
        setLayout(null);                // 取消默认布局
        setDefaultCloseOperation(3);    // 设置关闭模式

        this.addKeyListener(this);

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        System.out.println(code);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("键盘松开了");
    }
}
