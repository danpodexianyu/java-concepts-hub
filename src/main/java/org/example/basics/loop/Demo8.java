package org.example.basics.loop;

public class Demo8 {
    public static void main(String[] args) {
        // 循环高级综合练习
        // 案例1: 逢7过
        // 需求: 使用程序在控制台打印出1-100之间的满足逢7必过规则的数据
        // 游戏规则：从任意一个数字开始，当你要报的数字是包含7或者是7的倍数时都要说：过

        // 分析：1-100中包含7
        // 1. 个位包含7 -> i % 10 == 7
        // 2. 十位包含7 -> i / 10 % 10 == 7
        // 3. 被7整除 -> i % 7 == 0
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
