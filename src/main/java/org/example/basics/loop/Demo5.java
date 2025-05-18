package org.example.basics.loop;

public class Demo5 {
    public static void main(String[] args) {
        // 需求 5: 求1-5之间的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("1-5之间的和: " + sum);

        System.out.println("----------------------");

        int j = 1;
        int sum1 = 0;

        while (j <= 5) {
            sum1 += j;
            j++;
        }

        System.out.println("1-5之间的和: " + sum1);
    }
}
