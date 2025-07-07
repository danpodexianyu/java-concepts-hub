BigInteger

1. public BigInteger(int num, Random rnd): 获取随机大整数，范围：0 ~ 2的num次方 - 1
2. public BigInteger(String val): 获取指定大整数
3. public BigInteger(String val, int radix): 获取指定进制的大整数
4. add(BigInteger val): 加法
5. subtract(BigInteger val): 减法
6. multiply(BigInteger val): 乘法
7. divide(BigInteger val): 除法，获取商
8. divideAndRemainder(BigInteger val): 除法，获取商和余数
9. pow(int exponent): 次幂
10. max/min(BigInteger val): 返回较大值/较小值
11. intValue(BigInteger val): 转为int类型整数，超出范围数据有误

总结：
	- 如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取
	- 如果BigInteger表示的数字超出long的范围，可以使用构造方法获取
	- 对象一旦创建，BigInteger内部记录的值不能发生改变
	- 只要进行计算都会产生一个新的BigInteger对象
	- 数组的最大长度是int的最大值: 2147483647，即21亿多
	- 数组中每一位能表示的数字: -2147483648 ~ 2147483647，即42亿多
	- BigInteger能表示的最大数字为: 42亿的21亿次方