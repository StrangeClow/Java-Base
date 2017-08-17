package GUL;

import javax.swing.*;

/**
 * User: zyx
 * Date: 2017/8/17 14:14
 */
public class java01 {
    public static void main(String[] args) {
        JFrame J  = new JFrame("我的第一个窗口");
        J.setSize(350,350);
        JButton JB = new JButton("我的第一个按钮");
       J.getContentPane().add(JB);
       J.setVisible(true);
    }
}
