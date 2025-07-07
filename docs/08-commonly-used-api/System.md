System

1. exit(int status): 用于终止当前正在运行的JVM
2. currentTimeMillis(): 用于获取当前时间, 单位为毫秒
3. arraycopy(Object src, int srcPos, Object dest, int destPos, int length): 数组拷贝
	- 如果数据源数组和目标数组都是基本数据类型，那么两者的数据类型必须要保持一致，否则会报错
	- 在拷贝的时候需要考虑数组的长度，如果超出范围，也会报错
	- 如果数组都是引用类型，那么子类类型也可以赋值给父类类型