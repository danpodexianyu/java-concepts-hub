package org.example.basics.loop;

public class NestedLoopContinue {
    public static void main(String[] args) {
        int i = 1, j = 1;

        // 外层循环
        while (i <= 3) {

            System.out.println("Outer Loop: " + i);

            // 内层循环
            while (j <= 3) {

                if (j == 2) {
                    j++;
                    continue;
                }

                System.out.println("Inner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}
