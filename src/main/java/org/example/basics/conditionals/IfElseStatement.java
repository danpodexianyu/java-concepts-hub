package org.example.basics.conditionals;

public class IfElseStatement {
    public static void main(String[] args) {
        int number = 10;

        // checks if the number less than 0
        if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }

        System.out.println("Statement outside if...else block");
    }
}
