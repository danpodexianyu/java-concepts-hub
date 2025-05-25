package org.example.basics.operator;

public class SelfAddMinus {
    public static void main(String[] args) {
        int a = 3;
        int b = a++; // 先将a赋值给b，再将a的值加1
        int c = a;
        int d = a--; // 先将a赋值给d，再将a的值减1
        int e = ++a; // 先将a的值加1，再将a的值赋值给e
        int f = --a; // 先将a的值加1，再将a的值赋值给f
        int g = a++ * ++a; // => a++ = 3; 此时a的值已经是4，因此 ++a将返回5，即 int g = 3 * 5;

        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // 3
        System.out.println("c = " + c); // 4
        System.out.println("d = " + d); // 4
        System.out.println("e = " + e); // 4
        System.out.println("f = " + f); // 3
        System.out.println("g = " + g); // 15
    }
}
