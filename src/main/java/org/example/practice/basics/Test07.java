package org.example.practice.basics;

import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
        // 1. 定义数组表示奖金池
        int[] arr = {2, 588, 888, 1000, 10000};
        // 2. 定义新数组用于存储抽奖结果
        int[] newArr = new int[arr.length];
        // 3. 抽奖
        Random r = new Random();
        for (int i = 0; i < 5;) {
            // 获取随机索引值
            int randomIndex = r.nextInt(arr.length);
            // 获取奖项
            int prize = arr[randomIndex];
            // 判断奖项是否已经在奖金池中存在
            // 如果存在则重新抽取，如果不存在，就表示是有效奖项
            if (!contains(newArr, prize)) {
                newArr[i] = prize;
                System.out.println(prize + "元的奖金被抽出");
                i++;
            }
        }
    }

    /**
     * 判断奖项在奖金池中是否存在
     * @param arr 奖金池
     * @param prize 奖项
     * @return 存在返回true，否则返回false
     */
    public static boolean contains(int[] arr, int prize) {
        for (int i : arr) {
            if (prize == i) {
                return true;
            }
        }
        return false;
    }
}
