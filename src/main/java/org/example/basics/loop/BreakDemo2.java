package org.example.basics.loop;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
        double number, sum = 0.0;

        // 创建Scanner对象用于获取用户输入
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");

            // 获取用户输入的数字
            number = input.nextDouble();

            // 如果用户输入的数字为负数，则终止循环
            if (number < 0) {
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
