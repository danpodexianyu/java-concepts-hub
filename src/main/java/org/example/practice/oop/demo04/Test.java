package org.example.practice.oop.demo04;

public class Test {
    public static void main(String[] args) {
        /*
         * 案例：对象数组
         *
         * 定义一个数组长度为3的数组，数组存储1～3名学生对象作为初始数据，学生对象的学号、姓名各不相同。
         * 学生的属性：学号、姓名、年龄
         *
         * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
         * 要求2：添加完毕之后，遍历所有学生信息
         * 要求3：通过ID删除学生信息，如果存在，则删除，如果不存在，则提示删除失败
         * 要求4：删除完毕之后，遍历所有学生信息
         * 要求5：查询数组ID为 'heima002'的学生，如果存在，则将他的年龄+1岁
         */

        // 1. 定义用于存储学生对象的数组
        Student[] students = new Student[3];

        // 2. 创建学生对象
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        // 3. 将学生对象添加到数组
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;

        // 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4, "zhaoliu", 26);

        // 判断学号的唯一性
        boolean contains = contains(students, stu4.getId());
        if (contains) {
            System.out.println("学生ID已存在，请修改后再进行添加");
            return;
        }

        // 将学生添加到数组中
        // 检查学生数组中学生的数量
        int count = getCount(students);

        // 1. 数组已存满
        if (students.length == count) {
            // 创建新的数组，并复制旧数组中的元素
            Student[] newStudents = createNewArray(students);
            // 添加新学生对象
            newStudents[count] = stu4;
            // 要求2：添加完毕之后，遍历所有学生信息
            printStudents(newStudents);
        } else {
            // 2. 数组未存满
            students[count] = stu4;
            printStudents(students);
        }


        // 要求3：通过ID删除学生信息，如果存在，则删除，如果不存在，则提示删除失败
        int index = getIndex(students, stu1.getId());
        if (index != -1) {
            students[index] = null;
            // 要求4：删除完毕之后，遍历所有学生信息
            System.out.println("after delete student");
            printStudents(students);
        } else {
            System.out.println("该学生ID不存在，删除失败");
        }

        // 要求5：查询数组ID为 'heima002'的学生，如果存在，则将他的年龄+1岁
        // 当前学生ID为int, 假设查询数组ID为2的学生
        int indexForId2 = getIndex(students, stu2.getId());
        if (indexForId2 != -1) {
            Student student = students[indexForId2];
            student.setAge(student.getAge() + 1);
            System.out.println("after student age setup");
            printStudents(students);
        }
    }

    /**
     * 查找ID在数组中的索引
     *
     * @param students 学生数组
     * @param id       学生ID
     * @return 如果存在ID，则返回对应学生的索引，否则返回-1
     */
    public static int getIndex(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student == null) {
                continue;
            }

            if (student.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static Student[] createNewArray(Student[] oldStudents) {
        // 新数组的长度为旧数组的长度加一
        Student[] newStudents = new Student[oldStudents.length + 1];
        for (int i = 0; i < oldStudents.length; i++) {
            newStudents[i] = oldStudents[i];
        }
        return newStudents;
    }

    private static int getCount(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                count++;
            }
        }

        return count;
    }


    /**
     * 判断学生ID在数组中是否存在
     *
     * @param students 学生数组
     * @param id       学生ID
     * @return 如果存在，则返回true，否则返回false
     */
    public static boolean contains(Student[] students, int id) {
        for (Student student : students) {
            int sid = student.getId();
            if (sid == id) {
                return true;
            }
        }

        return false;
    }
}
