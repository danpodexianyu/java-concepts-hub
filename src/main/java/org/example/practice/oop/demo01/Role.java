package org.example.practice.oop.demo01;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        this.setFace();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace() {
        if ('男' == this.gender) {
            this.face = RoleFace.randomFace(RoleFace.BOY_FACES);
        } else if ('女' == this.gender) {
            this.face = RoleFace.randomFace(RoleFace.GIRL_FACES);
        } else {
            this.face = "面目狰狞";
        }
    }

    // 定义一个方法用于攻击别人
    public void attack(Role enemy) {
        Random r = new Random();

        // 攻击效果
        int attackIndex = r.nextInt(Attack.ATTACK_DESC.length);
        String attackDesc = Attack.ATTACK_DESC[attackIndex];
        System.out.printf(attackDesc, this.getName(), enemy.getName());
        System.out.println();

        // 计算造成的伤害 1 ～ 20
        int hurt = r.nextInt(20) + 1;

        // 剩余血量
        int remainBlood = enemy.getBlood() - hurt;
        // 对剩余血量做一个验证，如果为负数了，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改一下挨揍人的血量
        enemy.setBlood(remainBlood);

        // 受伤的描述
        // 血量 > 90 index = 0
        // 80 ~ 90 index = 1
        // 70 ~ 80 index = 2
        // 60 ~ 70 index = 3
        // 40 ~ 60 index = 4
        // 20 ~ 40 index = 5
        // 10 ~ 20 index = 6
        // < 7 index = 7
        if (enemy.getBlood() > 90) {
            System.out.printf(Attack.INJURED_DESC[0], enemy.getName());
        } else if (enemy.getBlood() > 80 && enemy.getBlood() <= 90) {
            System.out.printf(Attack.INJURED_DESC[1], enemy.getName());
        } else if (enemy.getBlood() > 70 && enemy.getBlood() <= 80) {
            System.out.printf(Attack.INJURED_DESC[2], enemy.getName());
        } else if (enemy.getBlood() > 60 && enemy.getBlood() <= 70) {
            System.out.printf(Attack.INJURED_DESC[3], enemy.getName());
        } else if (enemy.getBlood() > 40 && enemy.getBlood() <= 60) {
            System.out.printf(Attack.INJURED_DESC[4], enemy.getName());
        } else if (enemy.getBlood() > 20 && enemy.getBlood() <= 40) {
            System.out.printf(Attack.INJURED_DESC[5], enemy.getName());
        } else if (enemy.getBlood() > 10 && enemy.getBlood() <= 20) {
            System.out.printf(Attack.INJURED_DESC[6], enemy.getName());
        } else if (enemy.getBlood() < 7) {
            System.out.printf(Attack.INJURED_DESC[7], enemy.getName());
        }
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + this.getName());
        System.out.println("血量为：" + this.getBlood());
        System.out.println("性别为：" + this.getGender());
        System.out.println("长相为：" + this.getFace());
    }
}
