package org.example.practice.jigsaw.ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public abstract class MyJFrame extends JFrame {

    public static final String IMAGE_URL = "src/main/java/org/example/practice/jigsaw/image/";
    public static final String REGISTER_IMAGE_URL = "src/main/java/org/example/practice/jigsaw/image/register/";
    public static final String LOGIN_IMAGE_URL = "src/main/java/org/example/practice/jigsaw/image/login/";

    @Override
    protected void frameInit() {
        super.frameInit();
        this.setSize(470, 420);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    protected abstract void viewInit();
}
