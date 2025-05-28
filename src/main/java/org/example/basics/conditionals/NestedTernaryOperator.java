package org.example.basics.conditionals;

public class NestedTernaryOperator {
    public static void main(String[] args) {
        int n1 = 2, n2 = 9, n3 = -11; // 创建3个整型的变量

        // 使用嵌套三元运算符找出3个变量中的最大值
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("The Largest Number is: " + largest);
    }
}
