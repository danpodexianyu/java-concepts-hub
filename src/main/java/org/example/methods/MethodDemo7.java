package org.example.methods;

public class MethodDemo7 {
    public static void main(String[] args) {
        // 1. 定义原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 2. 调用方法拷贝数据
        int[] copyArr = copyOfRange(arr, 3, 7);

        // 3. 遍历
        for (int i : copyArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] copyOfRange(int[] source, int from, int to) {
        // 1. 定义数组
        int[] target = new int[to - from];

        // 2. 把原始数组中的from到to上对应的元素，直接拷贝到target中
        int index = 0; // 伪造索引的思想
        for (int i = from; i < to; i++) {
            target[index] = source[i];
            index++;
        }

        // 3. 把新数组返回
        return target;
    }
}
