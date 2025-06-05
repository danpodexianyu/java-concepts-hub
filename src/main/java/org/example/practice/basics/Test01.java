package org.example.practice.basics;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 分析
        // 1. 键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份：");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0.头等舱 1.经济舱");
        int seat = sc.nextInt();
        // 2. 判断是淡季还是旺季
        // 3. 判断是头等舱还是经济舱
        // 4. 根据实际情况计算对应的价格
        if (month >= 5 && month <= 10) {
            // 旺季
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            // 表示键盘录入的是一个非法数据
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(ticket);
    }

    public static int getPrice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            // 头等舱
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            // 经济舱
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
