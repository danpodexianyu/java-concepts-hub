package org.example.date;

import java.text.SimpleDateFormat;
import java.util.Date;

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
