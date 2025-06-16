package org.example.practice.oop.demo02;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 定义存储汽车的数组
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            // 创建汽车对象
            Car car = new Car();

            // 通过键盘录入汽车的属性
            // 品牌
            System.out.println("请输入汽车的品牌：");
            car.setBrand(sc.next());

            // 价格
            System.out.println("请输入汽车的价格：");
            car.setPrice(sc.nextDouble());

            // 颜色
            System.out.println("请输入汽车的颜色：");
            car.setColor(sc.next());

            // 将当前创建的汽车存储到数组中
            cars[i] = car;
        }

        // 遍历数组
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
