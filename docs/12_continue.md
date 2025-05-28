# continue

在使用[循环](08_循环.md)时，有时候需要跳过循环内的某些语句或立即退出循环，这种情况下，我们就需要使用[break](11_break.md)和**continue**。

**continue**用于跳过循环中的某一次迭代，并且**continue**关键字前面的代码还是会执行。

> 注意：continue关键字几乎总是和[if...else](09_条件控制.md)一块儿使用

示例1: 打印1-10之间的数

```java
public class ContinueDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {

            // 如果i的值大于4并且小于9，则会跳过这些值的打印语句
            if (i > 4 && i < 9) {
                continue;
            }

            System.out.println(i);
        }
    }
}
```

运行结果:

```text
1
2
3
4
9
10
```

示例2: 嵌套循环中的continue

```java
public class NestedLoopContinue {
    public static void main(String[] args) {
        int i = 1, j = 1;

        // 外层循环
        while (i <= 3) {

            System.out.println("Outer Loop: " + i);

            // 内层循环
            while (j <= 3) {

                if (j == 2) {
                    j++;
                    continue;
                }

                System.out.println("Inner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}
```

运行结果:

```text
Outer Loop: 1
Inner Loop: 1
Inner Loop: 3
Outer Loop: 2
Outer Loop: 3
```

## 带标签的continue语句

参考**break**关键字的用法。

> 注意：不推荐使用带标签的continue，因为这会使得我们的代码难以理解。如果必须要使用，那么我们需要考虑对代码进行重构，尝试不同的解决方案，使其更具有可读性。
