package day9.demo1;

import javax.swing.*;

/**
 * @author NJR10byh
 * @date 2022/7/26 10:19:55
 * @description 简写匿名内部类（GUI）
 */

public class task1 {
    public static void main(String[] args) {
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
//        btn.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "点击了按钮！");
//            }
//        });

        // 简化写法
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "点击了按钮！"));

        panel.add(btn);

        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
