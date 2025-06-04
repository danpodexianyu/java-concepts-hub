package org.example.methods;

public class MethodDemo2 {
    public static void main(String[] args) {
        printSum(10, 20);

        calcPerimeter(5.2, 1.3); // 13.0
    }

    public static void printSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("result = " + result);
    }

    public static void calcPerimeter(double length, double width) {
        double result = (length + width) * 2;
        System.out.println("长方形的周长为：" + result);
    }
}
