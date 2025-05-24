package org.example.basics.modifier;

public class PrivateModifier {
    private String format;

    // 使用getter方法获取私有变量format的值
    public String getFormat() {
        return format;
    }

    // 使用setter方法为format进行赋值
    public void setFormat(String format) {
        this.format = format;
    }
}
