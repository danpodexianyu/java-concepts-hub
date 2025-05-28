package org.example.basics.conditionals;

public class IfElseReplacedByTernaryOperator {
    public static void main(String[] args) {
        int number = 24;

        String result = (number > 0) ? "Positive Number" : "Negative Number";
        System.out.println(result);
    }
}
