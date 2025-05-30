package org.example.array;

public class IteratingArrays {
    public static void main(String[] args) {
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "String Element: " + (i + 1);
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
