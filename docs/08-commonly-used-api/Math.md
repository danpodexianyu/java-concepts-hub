Math类是Java提供给的数学工具类，位于java.lang包中，包含执行基本数值运算的静态方法。如：初等指数、对数、平方根和三角函数。

**常量字段**

- Math.PI
- Math.E
- ...

**生成随机数**

```java
double random = Math.random(); // 生成[0.0, 1.0)之间的随机数

// 生成[1, 100]之间的随机数
int randomInt = (int) (Math.random() * 100) + 1;
```

### 常用的方法

1. abs()：返回参数的绝对值
2. ceil()：向上取整
3. floor()：向下取整
4. round()：四舍五入
5. min()：返回两个数中的最小值
6. max()：返回两个数中的最大值
7. pow()：返回第一个参数的第二个参数次方
8. sqrt()：计算参数的算术平方根
9. random()：返回一个随机数，取值范围为：[0.0, 1.0)