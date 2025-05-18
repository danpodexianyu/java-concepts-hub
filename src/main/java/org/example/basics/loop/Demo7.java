package org.example.basics.loop;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        // 需求 7: 统计满足条件的数字
        // 键盘录入两个数字, 表示一个范围
        // 统计这个范围中, 既能被3整除, 也能被5整除的数有多少个

        // 1. 定义能被整除的数的个数
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        // 2. 通过键盘输入两个数字
        System.out.println("请输入统计范围的起始值: ");
        int start = scanner.nextInt();

        System.out.println("请输入统计范围的结束值: ");
        int end = scanner.nextInt();

        // 3. 通过循环统计符合条件的数字
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }

        System.out.println(start + " ~ " + end + "之间既能被3整除, 也能被5整除的数字个数有: " + count + "个");
    }
}
