# switch

**switch**语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。

**语法**

```text
switch(expression) {

    case value1:
        // code
        break;
        
    case value2:
        // code
        break;
        
    ...
    ...
    
    default:
        // default statement
}
```

**新版语法**

```text
switch(expression) {
    case value1 -> {}
    case value2 -> {}
    ...
    default -> {}
}
```

规则：

1. switch语句中的变量可以是byte, short, int, char, String, enum
2. switch语句中可以有多个case分支
3. case后面的值的数据类型必须与switch语句中的变量一致，并且只能是常量或字面量
4. 当变量的值与case后面的值相等时，case后的语句才开始执行，直到出现break语句才会跳出switch语句
5. switch语句中可以包含一个default分支，这个分支一般写在最后，在没有与变量匹配的case语句时会执行这个分支，并且不需要break关键字

```java
public class SwitchDemo1 {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        
        System.out.println("你的等级是：" + grade);
    }
}
```

新版

```java
public class SwitchDemo2 {
    public static void main(String[] args) {
        char grade = 'C';
        
        switch (grade) {
            case 'A' -> System.out.println("优秀");
            case 'B', 'C' -> System.out.println("良好");
            case 'D' -> System.out.println("及格");
            case 'F' -> System.out.println("你还需再努力努力");
            default -> System.out.println("未知等级");
        }
        
        System.out.println("你的等级是：" + grade);
    }
}
```

运行结果：

```text
良好
你的等级是：C
```

