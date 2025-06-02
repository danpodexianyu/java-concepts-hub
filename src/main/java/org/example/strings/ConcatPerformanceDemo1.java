package org.example.strings;

public class ConcatPerformanceDemo1 {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four", "five"};

        String result = null;
        for (String s : strings) {
            result += s;
        }
    }
}
