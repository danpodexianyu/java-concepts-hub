Java中的Date类位于java.util包中，用于表示时间，精确到毫秒。
Date类主要用于表示日期和时间信息，是Java中处理日期和时间的基础类之一。

## 基本使用

### 创建Date对象

Date类中有多个构造函数，但是最常用的有两种方式：

1. 无参构造方法

```java
Date currentDate = new Date(); // 创建一个表示当前时间的Date对象
```

2. 指定时间的构造方法

```java
Date specificDate = new Date(0L); // 1970年1月1日00:00:00 GMT
```

### 常用的方法

- long getTime(): 返回自1970年1月1日以来的毫秒数
- void setTime(long ms): 设置时间
- int compareTo(Date anotherDate): 比较两个日期的顺序
- boolean after(Date date): 检查日期是否在指定日期之后
- boolean before(Date date): 检擦日期是否在指定日期之前

## Date类的格式化

Date类本身不提供格式化的功能，但是我们可以使用SimpleDateFormat类来格式化和解析日期

**案例**

```java
public class DateFormatExample {  
    public static void main(String[] args) {  
        Date date = new Date();  
  
        // 创建格式化对象  
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 E HH时mm分ss秒");  
  
        // 格式化日期  
        String formattedDate1 = sdf1.format(date);  
        String formattedDate2 = sdf2.format(date);  
  
        System.out.println("格式1：" + formattedDate1);  
        System.out.println("格式2：" + formattedDate2);  
    }  
}
```

输出结果为：

```text
格式1：2025-07-08 20:55:25
格式2：2025年07月08日 周二 20时55分25秒
```

### 格式化字母的含义


| 字母  | 含义       | 示例               |
| --- | -------- | ---------------- |
| y   | 年        | yyyy: 2025       |
| M   | 月        | MM: 01, MMM: Jan |
| d   | 日        | dd：01            |
| H   | 小时，24小时制 | HH: 09           |
| h   | 小时，12小时制 | hh: 01           |
| m   | 分钟       | mm：30            |
| s   | 秒        | ss：59            |
| S   | 毫秒       | SSS：789          |
| E   | 星期       | E：星期一            |
| a   | 上午/下午标记  | a：下午             |

## Date 的缺点

1. 线程不安全：Date对象是可变的，在多线程环境下可能会出现问题
2. 设计不佳：
	1. 月份从0开始，即0表示1月
	2. 年份从1900年开始计算
3. 时区处理复杂：Date类本身不包含时区信息，时区处理需要额外的类
4. 功能有限：缺乏许多常用的日期操作功能
