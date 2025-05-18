package org.example.basics.loop;

public class Demo4 {
    public static void main(String[] args) {
        // 需求 4: 循环打印断线重连, 最大重连次数5次
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次执行断线重连逻辑");
        }

        System.out.println("----------------------");

        int count = 1;
        while (count <= 5) {
            System.out.println("第" + count + "次执行断线重连逻辑");
            count++;
        }
    }
}
