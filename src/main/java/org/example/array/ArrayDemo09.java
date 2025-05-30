package org.example.array;

public class ArrayDemo09 {
    public static void main(String[] args) {
        // 交换数据
        // 需求：定义一个数组，存入1-5，按照要求交换索引对应的元素
        // 交换前：1, 2, 3, 4, 5
        // 交换后：5, 4, 3, 2, 1
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
