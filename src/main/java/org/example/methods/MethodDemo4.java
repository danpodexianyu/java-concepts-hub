package org.example.methods;

public class MethodDemo4 {
    public static void main(String[] args) {
        // 需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。如：[11, 22, 33, 44, 55]
        int[] array = {11, 22, 33, 44, 55};
        printArray(array);
    }

    private static void printArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                stringBuilder.append(array[i]);
            } else {
                stringBuilder.append(array[i]).append(",");
            }
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder);
    }
}
