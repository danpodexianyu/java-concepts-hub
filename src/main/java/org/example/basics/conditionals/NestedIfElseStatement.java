package org.example.basics.conditionals;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        // 声明一些double类型的参数
        double d1 = -1.0, d2 = 4.5, d3 = -5.3, largest;

        // 检查d1是否大于等于d2
        if (d1 >= d2) {
            // 检查是否d1大于等于d3
            if (d1 >= d3) {
                largest = d1;
            } else {
                largest = d3;
            }
        } else {
            // 检查是否d2大于等于d3
            if (d2 >= d3) {
                largest = d2;
            } else {
                largest = d3;
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}
