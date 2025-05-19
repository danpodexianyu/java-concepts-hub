package org.example.array;

import java.util.Random;

public class ArrayDemo10 {
    public static void main(String[] args) {
        // 打乱数组中的数据
        // 需求：定义一个数组，存入1~5，要求打乱数组中所有数据的顺序

        // 定义一个数组
        int[] arr = {1, 2, 3, 4, 5};

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 生成随机的下标
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
