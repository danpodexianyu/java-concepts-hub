package org.example.array;

@SuppressWarnings("unused")
public class ArrayDemo01 {

    public static void main(String[] args) {
        // 数组指的是一种容器，可以用来存储多个同种数据类型的值

        // 如何声明数组
        // 1. 数据类型 [] 变量名
        // 2. 数据类型 变量名[] -> 这种是C语言声明数组的方法，不推荐
        // int[] array1;

        // 如何初始化
        // 初始化：就是在内存中，为数组容器开辟空间，并将数据存入容器的过程

        // 数组的静态初始化
        int[] array = new int[]{1, 2, 3};

        // 也可以简写成下面的代码
        int[] a = {1, 2, 3};

        // 需求1：定义数组存储5个学生的年龄
        int[] ageArray = new int[]{11, 12, 13, 14, 15};

        // 需求2：定义数组存储3个学生的姓名
        String[] nameArray = {"张三", "李四", "王五"};

        // 需求3：定义数组存储4个学生的升高
        double[] heightArray = {1.82, 1.93, 1.73, 1.81};
    }

}
