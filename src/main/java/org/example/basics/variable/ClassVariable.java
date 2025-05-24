package org.example.basics.variable;

public class ClassVariable {
    private int a; // 声明私有成员变量
    public boolean bool = false; // 也可以在声明时进行初始化

    public static void main(String[] args) {
        ClassVariable obj = new ClassVariable(); // 创建对象
        obj.a = 10; // 访问成员变量a，并将其赋值为10
        System.out.println("a = " + obj.a); // obj.a = 10

        obj.bool = true;
        System.out.println("obj.bool = " + obj.bool); // obj.bool = true
    }
}
