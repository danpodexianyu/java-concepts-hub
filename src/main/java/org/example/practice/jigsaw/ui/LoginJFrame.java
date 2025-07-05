package org.example.practice.jigsaw.ui;

import org.example.practice.jigsaw.entity.User;
import org.example.practice.jigsaw.service.UserService;
import org.example.practice.jigsaw.util.CodeUtil;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginJFrame extends MyJFrame implements MouseListener {
    JButton loginBtn = new JButton();
    JButton registerBtn = new JButton();

    JTextField usernameJtf = new JTextField();
    JPasswordField passwordJtf = new JPasswordField();
    JTextField codeJtf = new JTextField();

    String codeStr;
    JLabel codeJlabel = new JLabel();

    public LoginJFrame() {
        viewInit();

        this.setVisible(true);
    }

    @Override
    protected void viewInit() {
        // 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon(LOGIN_IMAGE_URL + "用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        // 添加用户名输入框
        usernameJtf.setBounds(195, 134, 200, 30);
        this.getContentPane().add(usernameJtf);

        // 添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon(LOGIN_IMAGE_URL +"密码.png"));
        passwordText.setBounds(130, 195, 64, 16);
        this.getContentPane().add(passwordText);

        // 添加输入密码框
        passwordJtf.setBounds(195, 195, 200, 30);
        this.getContentPane().add(passwordJtf);

        // 验证码提示
        JLabel codeText = new JLabel(new ImageIcon(LOGIN_IMAGE_URL +"验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        // 验证码输入框
        codeJtf.setBounds(195, 256, 100, 30);
        this.getContentPane().add(codeJtf);

        codeStr = CodeUtil.getCode();
        codeJlabel.setText(codeStr);
        codeJlabel.setBounds(300, 256, 50, 30);
        this.getContentPane().add(codeJlabel);

        // 登录按钮
        loginBtn.setBounds(123, 310, 128, 47);
        loginBtn.setIcon(new ImageIcon(LOGIN_IMAGE_URL +"登录按钮.png"));
        loginBtn.setBorderPainted(false); // 去除按钮的边框
        loginBtn.setContentAreaFilled(false); // 去除按钮的背景
        loginBtn.addMouseListener(this);
        this.getContentPane().add(loginBtn);

        // 注册按钮
        registerBtn.setBounds(256, 310, 128, 47);
        registerBtn.setIcon(new ImageIcon(LOGIN_IMAGE_URL +"注册按钮.png"));
        registerBtn.setBorderPainted(false); // 去除边框
        registerBtn.setContentAreaFilled(false);
        registerBtn.addMouseListener(this);
        this.getContentPane().add(registerBtn);

        // 背景图片
        JLabel background = new JLabel(new ImageIcon(LOGIN_IMAGE_URL +"background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }

    @Override
    protected void frameInit() {
        super.frameInit();
        this.setTitle(this.getTitle() + " 登录");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == loginBtn) {
            doLogin();
        } else if (obj == registerBtn) {
            // 关闭登录界面
            this.setVisible(false);
            // 显示注册界面
            new RegisterJFrame();
        }
    }

    private void doLogin() {
        // 获取用户输入的用户名
        String username = this.usernameJtf.getText();
        if (username.isBlank()) {
            JOptionPane.showMessageDialog(this, "用户名不能为空！");
            return;
        }

        char[] passwordChars = this.passwordJtf.getPassword();
        if (passwordChars.length == 0) {
            JOptionPane.showMessageDialog(this, "密码不能为空！");
            return;
        }

        String code = this.codeJtf.getText();
        if (code.isBlank()) {
            JOptionPane.showMessageDialog(this, "验证码不能为空！");
            return;
        }

        if (!code.equalsIgnoreCase(codeStr)) {
            JOptionPane.showMessageDialog(this, "验证码错误，请重新输入！");
            codeJtf.setText(null);
            codeStr = CodeUtil.getCode();
            codeJlabel.setText(codeStr);
            return;
        }

        User user = UserService.login(username, new String(passwordChars));
        if (user == null) {
            JOptionPane.showMessageDialog(this, "用户名或密码错误，请重新输入！");
            return;
        }

        // 进入游戏
        this.setVisible(false);
        new GameJFrame();
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
