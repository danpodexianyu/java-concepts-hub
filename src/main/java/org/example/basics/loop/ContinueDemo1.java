package org.example.basics.loop;

public class ContinueDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {

            // 如果i的值大于4并且小于9，则会跳过这些值的打印语句
            if (i > 4 && i < 9) {
                continue;
            }

            System.out.println(i);
        }
    }
}
