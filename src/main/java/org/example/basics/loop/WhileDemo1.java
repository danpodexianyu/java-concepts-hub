package org.example.basics.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        // 案例1: 打印折纸的次数
        // 需求: 世界上最高峰是珠穆朗玛峰（8844.43米=8844430毫米）
        // 假如我有一张足够大的纸, 它的厚度为0.1毫米
        // 请问, 我折叠多少次, 可以折成珠穆朗玛峰的高度?

        // 分析: 折叠纸张, 每一次折叠纸张的厚度都是原先的两倍
        // double a = 0.1;
        // a *= 2;

        // 1. 定义一个变量用于记录山峰的高度
        double height = 8844430;
        // 2. 定义一个变量纸张的初始厚度
        double paperHeight = 0.1;
        // 3. 定义一个变量用于统计次数
        int count = 0;
        // 4. 循环折叠纸张, 只要纸张的厚度小于珠穆朗玛峰的高度, 那么循环就继续, 并且统计次数 +1
        while (paperHeight <= height) {
            paperHeight *= 2;
            count++;
        }

        System.out.println("需要折叠" + count + "次");
    }
}
