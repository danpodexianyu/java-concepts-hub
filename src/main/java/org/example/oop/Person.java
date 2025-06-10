package org.example.oop;

public class Person {
    private String name = "成员变量";

    public void testName() {
        String name = "局部变量";
        System.out.println(name); // 局部变量
        System.out.println(this.name); // 成员变量
    }
}
