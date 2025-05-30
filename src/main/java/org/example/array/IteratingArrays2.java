package org.example.array;

public class IteratingArrays2 {
    public static void main(String[] args) {
        String[] strings = new String[5];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "String Element: " + (i + 1);
        }

        for (String element : strings) {
            System.out.println(element);
        }
    }
}
