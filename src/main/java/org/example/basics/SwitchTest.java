package org.example.basics;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        // 需求：键盘录入星期数, 输出工作日 / 休息日
        // (1 ~ 5) 工作日, (6 ~ 7) 休息日

        // 1. 通过键盘输入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数: ");
        int weekDay = sc.nextInt();

        // 2. 通过switch语句输出工作日 / 休息日
        switch (weekDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("未知星期数");
        }
    }
}
