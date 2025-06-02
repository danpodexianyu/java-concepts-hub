package org.example.strings;

public class TextBlockIndentation {
    public static void main(String[] args) {
        String textBlock1 = """
                            This is a Java text block
                            """;

        String textBlock2 = """
                            This is a Java text block
                          """;

        String textBlock3 = """
                            This is a Java text block
                        """;

        System.out.println(textBlock1);
        System.out.println(textBlock2);
        System.out.println(textBlock3);
    }
}
