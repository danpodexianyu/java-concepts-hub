package org.example.basics.conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // 获取用户输入
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // 使用三目运算符检查用户输入的分数是否大于40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();
    }
}
