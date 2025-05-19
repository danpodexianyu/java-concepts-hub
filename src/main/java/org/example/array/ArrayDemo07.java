package org.example.array;

public class ArrayDemo07 {
    public static void main(String[] args) {
        /*
            求最值
            需求：已知数组元素为 {33, 5, 22, 44, 55}
            请找出数组中最大值并打印在控制台
        */
        int[] arr = {33, 5, 22, 44, 55};

        int max = arr[0]; // 假设数组中的最大值为 arr[0]
        for (int i = 1; i < arr.length; i++) {
            // 如果数组中其他元素比max的值大，就把其值赋值给max
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值为：" + max);
    }
}
