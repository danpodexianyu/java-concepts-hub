package org.example.basics.loop;

public class Demo6 {
    public static void main(String[] args) {
        // 需求 6: 求1-100中所有偶数的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100中所有偶数的和: " + sum);
    }
}
