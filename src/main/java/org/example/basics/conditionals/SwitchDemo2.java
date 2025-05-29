package org.example.basics.conditionals;

public class SwitchDemo2 {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A' -> System.out.println("优秀");
            case 'B', 'C' -> System.out.println("良好");
            case 'D' -> System.out.println("及格");
            case 'F' -> System.out.println("你还需再努力努力");
            default -> System.out.println("未知等级");
        }
        System.out.println("你的等级是：" + grade);
    }
}
