package org.example.practice.basics;

public class Test10 {
    public static void main(String[] args) {
        // 1. 创建二维数组并存储数据
        int[][] yearQuarterlyTurnovers = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        // 计算总营业额
        int total = 0; // 全年总营业额
        for (int i = 0; i < yearQuarterlyTurnovers.length; i++) {
            int quarterTurnoverSum = getSum(yearQuarterlyTurnovers[i]);
            System.out.println("第" + (i + 1) + "季度总营业额为：" + quarterTurnoverSum);
            total += quarterTurnoverSum;
        }

        System.out.println("全年总营业额为：" + total);
    }


    /**
     * 计算每个季度的总营业额
     *
     * @param quarterlyTurnovers 季度营业额数组
     * @return 季度营业额总额
     */
    public static int getSum(int[] quarterlyTurnovers) {
        int sum = 0;
        for (int turnover : quarterlyTurnovers) {
            sum += turnover;
        }
        return sum;
    }
}
