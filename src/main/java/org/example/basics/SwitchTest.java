package org.example.basics;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        // printWorkDays();
        ticketOrder();
    }

    private static void ticketOrder() {
        /*
         * 需求: 假设现在我们拨打了一个机票预定电话
         * 电话中语音提示:
         * 1. 机票查询
         * 2. 机票预定
         * 3. 机票改签
         * 4. 退出服务
         * 其他按键也是退出服务
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎致电机票预定热线");
        System.out.println("请根据按键提示选择需要的功能:");
        System.out.println("1. 机票查询");
        System.out.println("2. 机票预定");
        System.out.println("3. 机票改签");
        System.out.println("4. 退出服务");
        int key = scanner.nextInt();

        switch (key) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("没有该功能, 退出服务...");
        }
    }

    private static void printWorkDays() {
        // 需求：键盘录入星期数, 输出工作日 / 休息日
        // (1 ~ 5) 工作日, (6 ~ 7) 休息日

        // 1. 通过键盘输入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数: ");
        int weekDay = sc.nextInt();

        // 2. 通过switch语句输出工作日 / 休息日
        switch (weekDay) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
