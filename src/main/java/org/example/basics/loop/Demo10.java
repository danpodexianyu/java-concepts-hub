package org.example.basics.loop;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        // 案例：求质数
        // 需求：键盘输入一个正整数，判断该整数是否为一个质数
        // 解释：如果一个整数只能被1和本身整除，那么这就是一个质数，否则就是合数

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = scanner.nextInt();

        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "质数" : "合数");
    }
}
