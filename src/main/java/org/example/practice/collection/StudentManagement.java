package org.example.practice.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("---------- 欢迎来到黑马学生管理系统 ----------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询学生");
            System.out.println("5. 退出");
            System.out.println("请输入您的选择：");
            String choose = sc.next();

            switch (choose) {
                case "1" -> add(students);
                case "2" -> delete(students);
                case "3" -> update(students);
                case "4" -> query(students);
                case "5" -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }
                default -> System.out.println("对不起，没有该选项");
            }
        }
    }

    public static void add(List<Student> students) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生ID：");
            String sid = sc.next();
            if (contains(students, sid)) {
                System.out.println("当前学生ID已存在，请重新输入！");
            } else {
                student.setId(sid);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        student.setName(sc.next());

        System.out.println("请输入学生年龄：");
        student.setAge(sc.nextInt());

        System.out.println("请输入学生家庭住址：");
        student.setAddress(sc.next());

        students.add(student);
        System.out.println("学生信息添加成功");
    }

    public static void delete(List<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生ID：");
        String sid = sc.next();
        // 通过学生ID拿到学生对象的索引
        int index = getIndex(students, sid);
        if (index == -1) {
            System.out.println("学生ID：" + sid + " 不存在！");
            return;
        }

        // 删除对应的学生对象
        students.remove(index);
        System.out.println("学生 " + sid + " 删除成功");
    }

    private static int getIndex(List<Student> students, String sid) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public static void update(List<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生ID：");
        String sid = sc.next();

        int index = getIndex(students, sid);
        if (index == -1) {
            System.out.println("学生ID：" + sid + " 不存在，修改失败！");
            return;
        }

        Student student = students.get(index);
        System.out.println("请输入学生名称：");
        student.setName(sc.next());

        System.out.println("请输入学生年龄：");
        student.setAge(sc.nextInt());

        System.out.println("请输入学生家庭住址：");
        student.setAddress(sc.next());

        System.out.println("学生信息修改成功！");
    }

    public static void query(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        // 打印学生信息

        // 打印表头
        System.out.println("ID\t\t姓名\t年龄\t家庭住址");
        for (Student student : students) {
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge()
                    + "\t" + student.getAddress());
        }
    }

    public static boolean contains(List<Student> students, String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
