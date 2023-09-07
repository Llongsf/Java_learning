// package lxl.testdemo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniJisuanqi extends JFrame {
    JPanel jPanelText;
    JTextField textField;
    JPanel jPanelButton;
    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    JButton jButtonAdd;

    JButton jButton4;
    JButton jButton5;
    JButton jButton6;
    JButton jButtonJian;

    JButton jButton7;
    JButton jButton8;
    JButton jButton9;
    JButton jButtonMul;

    JButton jButton0;
    JButton jButtonChu;
    JButton jButtonHu;
    JButton jButtonEqual;
    int sum=0;
    String opString="";
	// 数字键的监听器
    public ActionListener buttonListener(String text){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+text);
            }
        };
    }
    //清除键的监听器
    public ActionListener clearButtonListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        };
    }
    //计算操作
    private void ops(){
        switch (opString) {
            case "+":
                if (textField.getText() != "") {
                    sum += Integer.parseInt(textField.getText());
                }
                else sum +=0;
                textField.setText(sum+"");
                opString="";
                break;
            case "-":
                if (textField.getText() != "") {
                    sum -= Integer.parseInt(textField.getText());
                }
                else sum -=0;
                textField.setText(sum+"");
                opString="";
                break;
            case "*":
                if (textField.getText() != "") {
                    sum *= Integer.parseInt(textField.getText());
                }
                else sum *=0;
                textField.setText(sum+"");
                opString="";
                break;
            case "/":
                if (textField.getText() != "") {
                    sum /= Integer.parseInt(textField.getText())!=0?Integer.parseInt(textField.getText()):1;
                }
                else sum /= 1;
                textField.setText(sum+"");
                opString="";
                break;
        }
    }
	//加减乘除及等于号的监听器
    public ActionListener optButtonListener(String op){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (op!="="){
                    ops();
                    opString=op;
                    if (textField.getText() != "") {
                        sum = Integer.parseInt(textField.getText());
                        textField.setText("");
                    }
                    else sum=0;
                }
                else {
                    ops();
                }
            }
        };
    }
	//初始化界面操作
    public MiniJisuanqi(){
        jPanelText = new JPanel();
        textField = new JTextField(25);
        textField.setText("");
        textField.setEditable(true);
        jPanelText.add(textField);
        jPanelButton = new JPanel(new GridLayout(4,4,10,10));
        jButton1 = new JButton("1");
        jButton1.addActionListener(buttonListener(jButton1.getText()));
        jButton2 = new JButton("2");
        jButton2.addActionListener(buttonListener(jButton2.getText()));
        jButton3 = new JButton("3");
        jButton3.addActionListener(buttonListener(jButton3.getText()));
        jButtonAdd = new JButton("+");
        jButtonAdd.addActionListener(optButtonListener(jButtonAdd.getText()));

        jButton4 = new JButton("4");
        jButton4.addActionListener(buttonListener(jButton4.getText()));
        jButton5 = new JButton("5");
        jButton5.addActionListener(buttonListener(jButton5.getText()));
        jButton6 = new JButton("6");
        jButton6.addActionListener(buttonListener(jButton6.getText()));
        jButtonJian = new JButton("-");
        jButtonJian.addActionListener(optButtonListener(jButtonJian.getText()));

        jButton7 = new JButton("7");
        jButton7.addActionListener(buttonListener(jButton7.getText()));
        jButton8 = new JButton("8");
        jButton8.addActionListener(buttonListener(jButton8.getText()));
        jButton9 = new JButton("9");
        jButton9.addActionListener(buttonListener(jButton9.getText()));
        jButtonMul = new JButton("*");
        jButtonMul.addActionListener(optButtonListener(jButtonMul.getText()));

        jButton0 = new JButton("0");
        jButton0.addActionListener(buttonListener(jButton0.getText()));
        jButtonChu = new JButton("/");
        jButtonChu.addActionListener(optButtonListener(jButtonChu.getText()));
        jButtonHu = new JButton("清除");
        jButtonHu.addActionListener(clearButtonListener());
        jButtonEqual = new JButton("=");
        jButtonEqual.addActionListener(optButtonListener(jButtonEqual.getText()));
        jPanelButton.add(jButton1);jPanelButton.add(jButton2);jPanelButton.add(jButton3);jPanelButton.add(jButtonAdd);
        jPanelButton.add(jButton4);jPanelButton.add(jButton5);jPanelButton.add(jButton6);jPanelButton.add(jButtonJian);
        jPanelButton.add(jButton7);jPanelButton.add(jButton8);jPanelButton.add(jButton9);jPanelButton.add(jButtonMul);
        jPanelButton.add(jButton0);jPanelButton.add(jButtonEqual);jPanelButton.add(jButtonHu);jPanelButton.add(jButtonChu);
        getContentPane().add("North",jPanelText);
        getContentPane().add("Center",jPanelButton);
    }
    // 主函数
    public static void main(String[] args) {
        MiniJisuanqi miniJisuanqi = new MiniJisuanqi();
        miniJisuanqi.setTitle("简单计算器");
        miniJisuanqi.setVisible(true);
        miniJisuanqi.pack();
        miniJisuanqi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miniJisuanqi.setResizable(false);
    }
}
