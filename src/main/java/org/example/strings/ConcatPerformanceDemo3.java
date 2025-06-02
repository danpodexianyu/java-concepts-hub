package org.example.strings;

public class ConcatPerformanceDemo3 {
    public static void main(String[] args) {
        String[] array = { "one", "two", "three", "four", "five" };

        StringBuilder temp = new StringBuilder();
        for (String s : array) {
            temp.append(s); // 避免循环内部StringBuilder和String的实例化，因此也避免了字符串的两次复制
        }
        String result = temp.toString();
    }
}
