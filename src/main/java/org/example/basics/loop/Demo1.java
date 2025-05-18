package org.example.basics.loop;

public class Demo1 {
    public static void main(String[] args) {
        // 需求 1: 打印5次 Hello World
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("----------------------");

        int i = 0; // 定义初始值
        while (i < 5) { // 循环条件
            System.out.println("Hello World");
            i++; // 条件控制语句
        }
    }
}
