package org.example.basics.variable;

public class StaticVariable {
    public static int count = 0;

    public static void main(String[] args) {
        StaticVariable.count = 10; // 通过类名访问

        StaticVariable obj = new StaticVariable();
        obj.count = 20; // 通过实例名访问
    }
}
