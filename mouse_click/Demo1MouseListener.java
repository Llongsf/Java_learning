package com.itheima.mouse;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Demo1MouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(514, 538); // 设置宽高
        frame.setLocationRelativeTo(null);    // 设置居中
        frame.setLayout(null);                // 取消默认布局
        frame.setDefaultCloseOperation(3);    // 设置关闭模式

        JButton btn = new JButton("按钮");
        btn.setBounds(0, 0, 100, 100);
        frame.getContentPane().add(btn);

        btn.addMouseListener(new MouseListenerImpl());


        frame.setVisible(true);
    }
}

class MouseListenerImpl implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标被点击了");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标被按下了");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开了");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标滑入了");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标滑出了");
    }
}



