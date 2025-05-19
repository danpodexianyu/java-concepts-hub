package org.example.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        // 遍历数组求和
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
