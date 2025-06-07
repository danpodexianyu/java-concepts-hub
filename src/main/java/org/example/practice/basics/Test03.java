package org.example.practice.basics;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        // 分析
        // 1. 将大小写字母全部放入到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII
            if (i <= 25) {
                // 向数组中添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                // 向数组中添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }

        StringBuilder result = new StringBuilder(); // 用于记录最终的结果

        // 2. 随机抽取4次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            // 利用随机索引获取数组中的元素并追加到最终的结果中
            result.append(chs[randomIndex]);
        }

        // 3. 随机生成数字0-9
        int number = r.nextInt(10);
        result.append(number);

        System.out.println(result);
    }
}
