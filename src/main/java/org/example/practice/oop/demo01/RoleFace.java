package org.example.practice.oop.demo01;

import java.util.Random;

public class RoleFace {

    public static final String[] BOY_FACES = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    public static final String[] GIRL_FACES = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌丑陋", "惨不忍睹"};

    private RoleFace() {
    }

    public static String randomFace(String[] faces) {
        Random r = new Random();
        int index = r.nextInt(faces.length);
        return faces[index];
    }
}
