package org.example.methods;

public class MethodDemo5 {
    public static void main(String[] args) {
        // 需求：求数组的最大值并返回
        int[] array = {1, 5, 7, 3, 8, 10};
        int max = getMax(array);
        System.out.println("数组的最大值为：" + max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
