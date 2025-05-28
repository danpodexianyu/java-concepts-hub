package org.example.basics.loop;

public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            // 如果i等于5，则立即退出循环
            if (i == 5) {
                break;
            }
            System.out.println(i); // 打印输出i的值
        }
    }
}
