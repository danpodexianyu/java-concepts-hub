package org.example.basics.loop;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        // 循环高级综合案例
        // 案例：求平方根
        // 需求：键盘输入一个大于等于2的整数x，计算并返回x的平方根，结果只保留整数部分，
        // 小数部分将被舍去

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                System.out.println(x + "的平方根是：" + i);
                break;
            } else if (i * i > x) {
                System.out.println(x + "的平方根整数是：" + (i - 1));
                break;
            }
        }
    }
}
