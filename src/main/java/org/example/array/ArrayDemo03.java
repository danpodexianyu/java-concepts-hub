package org.example.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        // 数组的遍历
        int[] array = {1, 2, 3, 4, 5};
        // 通过循环遍历数组
        // 初始值：0
        // 最大值：数组元素个数 - 1
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        System.out.println("--------------");

        // 通过length属性可以获取数组元素的个数
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
