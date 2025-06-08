package org.example.practice.basics;

import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        // 1. 定义数组表示奖金池
        int[] arr = {2, 588, 888, 1000, 10000};
        // 2. 打乱奖金池
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // 3. 遍历奖金池，从0索引开始获取每一个奖项
        for (int prize : arr) {
            System.out.println(prize + "元的奖金被抽出");
        }
    }
}
