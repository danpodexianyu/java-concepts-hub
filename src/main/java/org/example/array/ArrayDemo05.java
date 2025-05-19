package org.example.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        // 统计个数
        // 定义一个数组，存储1-10
        // 遍历数组得到每一个元素，统计数组中一共有多少个能被3整除的数字
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count = 0; // 存储符合统计条件的数字个数
        for (int i = 0; i < arr.length; i++) {
            // 获取数组元素
            int number = arr[i];
            // 判断是否能被3整除
            if (number % 3 == 0) {
                count++;
            }
        }

        // 打印输出统计结果
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }
}
