# break

在使用[循环](./08_循环.md)时，有时候需要跳过循环内的某些语句或立即退出循环，这种情况下，我们就需要使用**break**和[continue](./12_continue.md)。

**break**关键字可以立即退出循环，并且其几乎是和[if...else](08_条件控制.md)一起使用。

示例1：

```java
public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            // 如果i等于5，则立即退出循环
            if (i == 5) {
                break;
            }
            System.out.println(i); // 打印输出i的值
        }
    }
}
```

运行结果：

```text
1
2
3
4
```

示例2：

```java
public class BreakDemo2 {
    public static void main(String[] args) {
        double number, sum = 0.0;

        // 创建Scanner对象用于获取用户输入
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");

            // 获取用户输入的数字
            number = input.nextDouble();

            // 如果用户输入的数字为负数，则终止循环
            if (number < 0) {
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
```

运行结果：

```text
Enter a number: 3.2
Enter a number: 5
Enter a number: 2.3
Enter a number: 0
Enter a number: -4.5
Sum = 10.5
```

## break和嵌套循环

对于嵌套循环，**break**只会终止离其最近的一个循环，如下面的伪代码中，如果满足break所在的布尔表达式，break只会终止内层的循环，并且继续执行外层循环中的代码。

```text
while (布尔表达式) {
    // 代码片段
    while (布尔表达式) {
        // 代码片段
        if (布尔表达式) {
            break;
        }
        // 代码片段
    }
    // 代码片段
}
```

## 带标签的break语句

我们可以使用带标签的break语句来终止最外层循环。

语法：

```text
label:
while (布尔表达式) {
    while (布尔表达式) {
        if (布尔表达式) {
            break label;
        }
    }
}
```

示例3: 带标签的break语句

```java
public class LabeledBreak {
    public static void main(String[] args) {
        // 定义名为first的外层循环
        first:
        for (int i = 1; i < 5; i++) {

            // 定义名为second的内层循环
            second:
            for (int j = 1; j < 3; j++) {
                System.out.println("i = " + i + "; j = " + j);

                // 如果i等于2，终止外层循环
                if (i == 2)
                    break first;
            }
        }
    }
}
```

运行结果:

```text
i = 1; j = 1
i = 1; j = 2
i = 2; j = 1
```