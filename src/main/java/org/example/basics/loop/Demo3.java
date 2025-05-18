package org.example.basics.loop;

public class Demo3 {
    public static void main(String[] args) {
        // 需求 3: 打印输入 5 - 1
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("----------------------");

        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
