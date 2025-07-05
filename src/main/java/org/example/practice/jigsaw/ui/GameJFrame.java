package org.example.practice.jigsaw.ui;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends MyJFrame implements KeyListener, ActionListener {

    // 加载图片时，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];

    // 记录空白方块在数组中的位置
    int x = 0;
    int y = 0;

    String path = "src/main/java/org/example/practice/jigsaw/image/animal/animal3/";

    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
    };

    // 用于记录步数
    int step = 0;

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");


    public GameJFrame() {
        viewInit();

        initJMenuBar();

        initData();

        initImage();
        // 让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    @Override
    protected void viewInit() {
        this.setSize(603, 680);

        // 给游戏界面添加键盘监听事件
        this.addKeyListener(this);
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单中的选项
        JMenu funcJMenu = new JMenu("功能");
        funcJMenu.add(replayItem);
        funcJMenu.add(reLoginItem);
        funcJMenu.add(closeItem);

        // 关于我们条目
        JMenu aboutJMenu = new JMenu("关于我们");
        aboutJMenu.add(accountItem);


        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        // 将菜单选项添加到菜单条中
        jMenuBar.add(funcJMenu);
        jMenuBar.add(aboutJMenu);

        // 将游戏界面设置菜单栏
        this.setJMenuBar(jMenuBar);
    }

    private void initImage() {
        // 加载图片之前，先将所有的图片移除
        this.getContentPane().removeAll();

        if (victory()) {
            // 显示胜利的图片
            JLabel winJlabel = new JLabel(new ImageIcon(IMAGE_URL + "win.png"));
            winJlabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJlabel);
        }

        // 加载步数
        JLabel stepJlabel = new JLabel("步数：" + this.step);
        stepJlabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepJlabel);

        // 外循环，把内循环重复执行4次
        for (int i = 0; i < 4; i++) {
            // 内循环，表示在一行添加4张图片
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + number + ".jpg"));
                // 指定图片的位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 将管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景图片
        JLabel bgLabel = new JLabel(new ImageIcon(IMAGE_URL + "background.png"));
        bgLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bgLabel);

        // 加载完毕后，刷新界面
        this.getContentPane().repaint();
    }

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 打乱数组中的数据
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            // 获取随机索引
            int randomIndex = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }

        // 给二维数组添加数据
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // NOOP
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (victory()) {
            return;
        }

        int keyCode = e.getKeyCode();
        if (keyCode == 65) { // a
            // 将界面中的图片全部移除
            this.getContentPane().removeAll();
            // 加载完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // 加载背景图片
            JLabel bgLabel = new JLabel(new ImageIcon("src/main/java/org/example/practice/jigsaw/image/background.png"));
            bgLabel.setBounds(40, 40, 508, 560);
            this.getContentPane().add(bgLabel);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 判断游戏是否胜利，如果胜利，此方法需要直接结束，不再执行后续的代码
        if (victory()) {
            return;
        }

        // 对上下左右进行判断
        // 左：37，上：38，右：39，下：40
        int keyCode = e.getKeyCode();
        if (keyCode == 37 && y < 3) {
            // x, y + 1 表示空白方块右方的数字
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (keyCode == 38 && x < 3) {
            // x + 1, y 表示空白方块下方的数字
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (keyCode == 39 && y > 0) {
            // x, y + 1 表示空白方块右方的数字
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (keyCode == 40 && x > 0) {
            // x - 1, y 表示空白方块上方的数字
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (keyCode == 65) {
            initImage();
        } else if (keyCode == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16},
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayItem) {
            System.out.println("重新游戏");
            // 步数清零
            this.step = 0;
            // 再次打乱二维数组中的数据
            initData();
            // 重新加载图片
            initImage();
        } else if (source == reLoginItem) {
            // 关闭当前的游戏界面
            this.setVisible(false);
            // 打开登录界面
            new LoginJFrame();
        } else if (source == closeItem) {
            System.exit(0); // 直接关闭虚拟机
        } else if (source == accountItem) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon(IMAGE_URL + "about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            // 弹窗不关闭则不能操作下面的界面
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
