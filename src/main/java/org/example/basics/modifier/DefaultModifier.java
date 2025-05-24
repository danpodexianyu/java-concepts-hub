package org.example.basics.modifier;

public class DefaultModifier {
    public static void main(String[] args) {
        new DefaultModifierClass().display(); // Value of x is: 10
    }
}

class DefaultModifierClass {
    int x = 10; // 默认访问修饰符
    void display() {
        System.out.println("Value of x is: " + x);
    }
}
