package org.example.basics.loop;

public class Demo2 {
    public static void main(String[] args) {
        // 需求 2: 打印输入 1 - 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        System.out.println("----------------------");

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
