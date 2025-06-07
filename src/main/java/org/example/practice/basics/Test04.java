package org.example.practice.basics;

public class Test04 {
    public static void main(String[] args) {
        // 1. 定义一个数组并存储一些元素
        int[] arr = {1, 2, 3, 4, 5};

        // 2. 定义一个新的数组，数组长度与老数组一致
        int[] newArr = new int[arr.length];

        // 3. 遍历老数组，将老数组中的元素依次放入新的数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 4. 遍历新数组并打印元素的值
        for (int i : newArr) {
            System.out.println(i);
        }
    }
}
