package org.example.basics.variable;

public class LocalVariable {
    static {
        int a = 10;
        System.out.println("a = " + a);
    }

    public void foo() {
        int b = 20;

        // 可以先声明变量，再进行赋值操作
        int c;
        c = 30;

        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // 变量a只能在上面的代码块儿中访问
        // System.out.println(a);
    }

    public static void main(String[] args) {
        new LocalVariable().foo();
    }
}
