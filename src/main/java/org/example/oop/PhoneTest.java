package org.example.oop;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机的对象
        Phone p = new Phone();

        // 给手机对象赋值
        p.brand = "小米";
        p.prize = 1999.98;

        // 获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.prize);

        // 调用手机中定义的方法
        p.call();
        p.playGame();
    }
}
