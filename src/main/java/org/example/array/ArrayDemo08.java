package org.example.array;

import java.util.Random;

public class ArrayDemo08 {
    public static void main(String[] args) {
        // 遍历数组求和
        // 需求：生成10个1-100之间的随机数存储数组
        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100) + 1;
            // System.out.println(arr[i]);
        }

        // 1. 求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数字的和为：" + sum);

        // 2. 求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("所有数据的平均数为：" + avg);

        // 3. 统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("比平均值小的数据有：" + count);
    }
}
