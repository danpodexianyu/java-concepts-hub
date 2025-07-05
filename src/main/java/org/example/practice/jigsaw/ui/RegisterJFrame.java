package org.example.practice.jigsaw.ui;


import org.example.practice.jigsaw.service.UserService;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterJFrame extends MyJFrame implements MouseListener {

    JTextField usernameJtf = new JTextField();
    JPasswordField passwordJtf = new JPasswordField();
    JPasswordField passwordAgainJtf = new JPasswordField();

    JButton registerBtn = new JButton();
    JButton resetBtn = new JButton();

    public RegisterJFrame() {
        viewInit();
        this.setVisible(true);
    }

    @Override
    protected void frameInit() {
        super.frameInit();
        this.setTitle(this.getTitle() + "注册");
    }

    @Override
    protected void viewInit() {
        // 注册用户名
        JLabel usernameText = new JLabel(new ImageIcon(REGISTER_IMAGE_URL + "注册用户名.png"));
        usernameText.setBounds(100, 136, 79, 17);
        this.getContentPane().add(usernameText);

        usernameJtf.setBounds(195, 134, 200, 30);
        this.getContentPane().add(usernameJtf);

        // 注册密码
        JLabel passwordText = new JLabel(new ImageIcon(REGISTER_IMAGE_URL + "注册密码.png"));
        passwordText.setBounds(100, 195, 79, 17);
        this.getContentPane().add(passwordText);

        passwordJtf.setBounds(195, 195, 200, 30);
        this.getContentPane().add(passwordJtf);

        // 再次输入密码
        JLabel passwordAgainText = new JLabel(new ImageIcon(REGISTER_IMAGE_URL + "注册密码.png"));
        passwordAgainText.setBounds(100, 256, 79, 17);
        this.getContentPane().add(passwordAgainText);

        passwordAgainJtf.setBounds(195, 256, 200, 30);
        this.getContentPane().add(passwordAgainJtf);

        // 注册按钮
        registerBtn.setBounds(123, 310, 128, 47);
        registerBtn.setIcon(new ImageIcon(REGISTER_IMAGE_URL + "注册按钮.png"));
        registerBtn.setBorderPainted(false); // 去除按钮的边框
        registerBtn.setContentAreaFilled(false); // 去除按钮的背景
        registerBtn.addMouseListener(this);
        this.getContentPane().add(registerBtn);

        // 重置按钮
        resetBtn.setBounds(256, 310, 128, 47);
        resetBtn.setIcon(new ImageIcon(REGISTER_IMAGE_URL + "重置按钮.png"));
        resetBtn.setBorderPainted(false); // 去除按钮的边框
        resetBtn.setContentAreaFilled(false); // 去除按钮的背景
        resetBtn.addMouseListener(this);
        this.getContentPane().add(resetBtn);

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon(REGISTER_IMAGE_URL + "background.png"));
        background.setBounds(0, 0, 470, 420);
        this.getContentPane().add(background);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == registerBtn) {
            doRegister();
        } else if (source == resetBtn) {
            usernameJtf.setText(null);
            passwordJtf.setText(null);
            passwordAgainJtf.setText(null);
        }
    }

    private void doRegister() {
        String username = usernameJtf.getText();
        if (username.isBlank()) {
            JOptionPane.showMessageDialog(this, "用户名不能为空！");
            return;
        }

        String password = new String(passwordJtf.getPassword());
        String againPassword = new String(passwordAgainJtf.getPassword());
        if (password.isBlank() && againPassword.isBlank()) {
            JOptionPane.showMessageDialog(this, "注册密码不能为空！");
            return;
        }

        if (!password.equals(againPassword)) {
            JOptionPane.showMessageDialog(this, "两次密码输入不一致");
            return;
        }

        if (UserService.exists(username)) {
            JOptionPane.showMessageDialog(this, "用户名已存在");
            return;
        }

        UserService.register(username, password);
        JOptionPane.showConfirmDialog(this, "注册成功", "提示信息", JOptionPane.DEFAULT_OPTION);

        this.setVisible(false);
        new LoginJFrame();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
