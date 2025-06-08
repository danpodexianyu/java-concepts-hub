package org.example.practice.basics;

import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        // 1. 生成中奖号码
        int[] numbers = createNumber();

        // 2. 用户输入购买的彩票号码
        int[] userInputNumbers = userInputNumbers();

        // 3. 判断用户中奖情况
        int redCount = 0;

        // 判断红色球
        for (int i = 0; i < userInputNumbers.length - 2; i++) {
            if (contains(numbers, userInputNumbers[i])) {
                redCount++;
            }
        }

        // 判断蓝色球
        int blueNumberIndex = numbers.length - 1;
        int blueCount = numbers[blueNumberIndex] == userInputNumbers[blueNumberIndex] ? 1 : 0;

        System.out.println("************************");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("************************");

        System.out.println("redCount: " + redCount);
        System.out.println("blueCount: " + blueCount);

        // 4. 处理结果
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5元");
        }

    }

    public static int[] userInputNumbers() {
        // 1. 创建数组用于添加用户购买的彩票号码
        int[] arr = new int[7];

        // 2. 用户输入彩票号码
        Scanner sc = new Scanner(System.in);
        // 让用户输入红色球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红色球号码");
            int redNumber = sc.nextInt();
            // 红色球输入的范围1-33且不能重复
            if (redNumber < 1 || redNumber > 33) {
                System.out.println("当前红色球号码超出范围");
                continue;
            }

            if (contains(arr, redNumber)) {
                System.out.println("当前红色球号码已存在，请重新输入");
                continue;
            }

            arr[i] = redNumber;
            i++;
        }

        // 让用户输入蓝色球号码
        while (true) {
            System.out.println("请输入蓝色球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝色球号码超出范围，请重新输入");
            }
        }

        return arr;
    }

    /**
     * 生成双色球中奖号码。前6个为红球号码，最后1个为蓝球号码
     *
     * @return 双色球号码数组
     */
    public static int[] createNumber() {
        // 1. 创建数组用于存储中奖的号码
        // 6个红色球，1个蓝色球，数组长度为7
        int[] numbers = new int[7];

        // 2. 随机生成号码并添加到数组中
        // 红色球不能重复，蓝色球可以和红色球重复

        // 生成红色球号码并添加到数组中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            if (!contains(numbers, redNumber)) {
                numbers[i] = redNumber;
                i++;
            }
        }

        // 生成蓝色球号码并添加到数组
        int blueNumber = r.nextInt(16) + 1;
        numbers[numbers.length - 1] = blueNumber;
        return numbers;
    }

    public static boolean contains(int[] arr, int number) {
        for (int num : arr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
