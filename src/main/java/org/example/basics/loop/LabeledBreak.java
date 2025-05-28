package org.example.basics.loop;

public class LabeledBreak {
    public static void main(String[] args) {
        // 定义名为first的外层循环
        first:
        for (int i = 1; i < 5; i++) {

            // 定义名为second的内层循环
            second:
            for (int j = 1; j < 3; j++) {
                System.out.println("i = " + i + "; j = " + j);

                // 如果i等于2，终止外层循环
                if (i == 2)
                    break first;
            }
        }
    }
}
