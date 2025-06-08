package org.example.practice.basics;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 1. 定义一个数组用于存储6个评委的打分
        int[] scores = getScore();

        // 2. 找出数组中的最大值
        int max = getMax(scores);
        // 3. 找出数组中的最小值
        int min = getMin(scores);
        // 4. 总和
        int sum = getSum(scores);

        // 5. 计算最终结果
        int avg = (sum - max - min) / (scores.length - 2);

        System.out.println("选手的最终得分为：" + avg);
    }

    private static int getSum(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    private static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        return min;
    }

    private static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int[] getScore() {
        // 定义数组
        int[] scores = new int[6];
        // 使用键盘录入的形式，输入分数 0 ～ 100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("您输入的分数超出范围");
            }
        }
        return scores;
    }
}
