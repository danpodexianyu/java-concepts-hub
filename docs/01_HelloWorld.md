# Hello World

我的第一个Java程序

创建文件 `HelloWorld.java`，代码如下：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

如何在控制台运行以上实例：
```
javac HelloWorld.java
java HelloWorld
```

命令解析：

- `javac`：将Java文件编译为字节码文件。后面跟的是java文件名，运行该命令后会生成一个HelloWorld.class的文件。
- `java`：运行程序。后面跟着的是java文件中的类名，即 HelloWorld