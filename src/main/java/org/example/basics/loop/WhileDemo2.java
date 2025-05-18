package org.example.basics.loop;

public class WhileDemo2 {
    public static void main(String[] args) {
        // 案例2: 回文数
        // 需求: 给你一个整数x, 如果是一个回文整数, 打印true, 否则, 返回false
        // 解释: 回文数是指正序和倒序读都是一样的整数。如: 121是回文数, 而123不是

        // 1. 定义整数x
        int x = 123;
        int temp = x; // 定义一个临时变量存储x的初始值, 用于最后与反序x的比较
        // 2. 定义一个变量用于存储倒序的x
        int num = 0;
        // 3. 循环处理x
        while (x != 0) {
            // 从右至左获取个位数
            int digit = x % 10;
            // 修改x的值
            x /= 10;
            // 重新赋值倒序的x
            num = num * 10 + digit;
        }

        // 比较正序反序x的值是否相等
        System.out.println(temp == num);
    }
}
