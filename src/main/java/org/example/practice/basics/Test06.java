package org.example.practice.basics;

public class Test06 {
    public static void main(String[] args) {
        int number = encrypt(1983);
        System.out.println("加密后的结果为：" + number);

        int decrypt = decrypt(number);
        System.out.println("解密后的结果为：" + decrypt);
    }

    private static int decrypt(int number) {
        // 解密
        int[] array = getArray(number);

        // 1. 反转数组中的数字
        reverse(array);

        // 2. 由于加密是通过对10取模的方式进行获取的
        // 所以在解密时就需要进行判断，0～4之间+10，5～9不变
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] <= 4) {
                array[i] += 10;
            }
        }

        // 3. 每个数字减5
        for (int i = 0; i < array.length; i++) {
            array[i] -= 5;
        }

        return getInt(array);
    }

    public static int encrypt(int number) {
        // 1. 把整数中的每一位放到数组中
        int[] arr = getArray(number);

        // 2. 加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }

        // 反转数组中的数字
        reverse(arr);

        // 3. 把数组里面的每一位数字进行拼接，变成加密后的结果
        return getInt(arr);
    }

    private static int getInt(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i : arr) {
            builder.append(i);
        }

        return Integer.parseInt(builder.toString());
    }

    private static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int[] getArray(int number) {
        int temp = number; // 用于处理将每一位数字放入数组

        // 1. 计算出数组的长度
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        // 2. 定义动态数组
        int[] arr = new int[count];

        // 3. 将数字中的每一位放入数组
        int index = arr.length - 1;
        while (temp != 0) {
            arr[index] = temp % 10;
            temp /= 10;
            index--;
        }
        return arr;
    }
}
