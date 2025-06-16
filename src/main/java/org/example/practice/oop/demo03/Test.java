package org.example.practice.oop.demo03;

public class Test {
    public static void main(String[] args) {
        /*
         * 案例：对象数组3
         *
         * 定义数组存储3个手机对象
         * 手机的属性：品牌、价格、颜色
         * 要求：计算出三部手机的平均价格
         */

        // 1. 定义用于存储手机对象的数组
        Phone[] phones = new Phone[3];

        // 2. 定义3个手机对象
        Phone p1 = new Phone("小米", 4999, "白色");
        Phone p2 = new Phone("华为", 7999, "黑色");
        Phone p3 = new Phone("荣耀", 5999, "灰色");

        // 3. 将手机对象存储到数组中
        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        // 4. 计算三部手机的平均价格
        double sum = 0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }

        double avg = sum / phones.length;
        System.out.println("三部手机的平均价格为：" + avg);
    }
}
