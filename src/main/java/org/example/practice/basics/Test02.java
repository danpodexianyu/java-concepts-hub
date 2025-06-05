package org.example.practice.basics;

public class Test02 {
    public static void main(String[] args) {
        int count = 0; // 用于存储质数的个数
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
                System.out.println("当前数字" + i + "是质数");
            }
        }

        System.out.println("101～200之间一共有" + count + "质数");
    }
}
