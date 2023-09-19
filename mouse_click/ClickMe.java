package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickMe extends JFrame implements MouseListener {

    public static void main(String[] args) {
        ClickMe c = new ClickMe();
        c.init();
    }

    JButton btn = new JButton("按钮");

    public void init() {
        setSize(514, 538); // 设置宽高
        setLocationRelativeTo(null);    // 设置居中
        setLayout(null);                // 取消默认布局
        setDefaultCloseOperation(3);    // 设置关闭模式


        btn.setBounds(0, 0, 100, 100);
        getContentPane().add(btn);

        btn.addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    int flag = 1;

    @Override
    public void mouseEntered(MouseEvent e) {

        if(flag == 1){
            // 设置到一个位置, 300, 0,300就是横移的距离
            btn.setBounds(300, 0, 100, 100);
            flag = 2;
        }else if(flag == 2){
            // 设置到 0,0 位置
            btn.setBounds(0, 0, 100, 100);
            flag = 1;
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

