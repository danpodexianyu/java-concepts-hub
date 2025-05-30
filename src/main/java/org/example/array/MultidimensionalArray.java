package org.example.array;

public class MultidimensionalArray {
    public static void main(String[] args) {
        String[][] strings = new String[1][2];
        strings[0][0] = "Hello";
        strings[0][1] = "World";

        for (String[] innerArray : strings) {
            for (String element : innerArray) {
                System.out.print(element);
            }
        }
    }
}
