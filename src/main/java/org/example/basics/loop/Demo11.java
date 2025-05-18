package org.example.basics.loop;

import java.util.Random;
import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        // 案例：猜数字小游戏
        // 需求：由程序自动生成一个1-100之间的随机数，使用程序实现猜出这个数字是多少
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int guessNumber = scanner.nextInt();

            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
    }
}
