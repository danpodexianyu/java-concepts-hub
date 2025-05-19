package org.example.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        // 利用索引/下标对数组中的元素进行访问
        int[] array = {1, 2, 3, 4, 5};
        // 1. 获取数组中的元素
        int number = array[0];
        System.out.println(number);

        // 或者直接打印输出
        System.out.println(array[0]);

        // 2. 把数据存储到数组中
        // 格式：变量名[下标] = 值
        // 数据一旦覆盖，原来的数据就不存在了
        array[0] = 2;
        System.out.println(array[0]); // 2
    }
}
