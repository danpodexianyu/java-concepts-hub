BigDecimal

1. 构造方法获取BigDecimal对象
	- BigDecimal(double val): 这种方式可能是不精确的，不推荐使用
	- BigDecimal(String val): 通过传递字符串表示的小数来创建对象
2. valueOf(double val): 通过静态方法获取对象
3. 如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
4. 如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
5. 如果我们传递的是0~10之间的整数，那么方法会返回已经创建好的对象，不会重新new

底层存储方式: 存储的是每一个字符在ASCII码表中的数字