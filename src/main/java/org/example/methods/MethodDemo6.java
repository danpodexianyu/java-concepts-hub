package org.example.methods;

public class MethodDemo6 {
    public static void main(String[] args) {
        // 需求：判断一个数在数组中是否存在
        int[] array = {1, 5, 8, 12, 56, 89, 34, 67};

        boolean contains = contains(array, 89);
        System.out.println("contains = " + contains);
    }

    public static boolean contains(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
