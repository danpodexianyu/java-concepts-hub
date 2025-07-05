package org.example.practice.jigsaw.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 验证码工具类
 *
 * @author xianyu
 * @since 2025.07.03
 */
public class CodeUtil {

    public static final List<Character> characters = new ArrayList<>();

    private CodeUtil() {
    }

    static {
        for (int i = 0; i < 26; i++) {
            characters.add((char) ('a' + i));
            characters.add((char) ('A' + i));
        }
    }

    /**
     * 生成一个5位随机验证码，其中4个字母，1个数字，数字的位置随机
     *
     * @return 5位的随机验证码
     */
    public static String getCode() {
        // 生成随机字母
        StringBuilder result = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            // 获取随机索引
            int randomIndex = r.nextInt(characters.size());
            result.append(characters.get(randomIndex));
        }

        // 生成随机数字
        int randomNumber = r.nextInt(10);
        result.append(randomNumber);

        // 对随机数字进行位置替换
        char[] charArray = result.toString().toCharArray();
        int randomIndex = r.nextInt(charArray.length);
        char temp = charArray[randomIndex];
        charArray[randomIndex] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = temp;
        return new String(charArray);
    }
}
