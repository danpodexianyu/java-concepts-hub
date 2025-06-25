package org.example.practice.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(users);
                case "2" -> register(users);
                case "3" -> forgetPassword(users);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void forgetPassword(List<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        boolean exists = contains(users, username);
        if (!exists) {
            System.out.println("用户：" + username + " 未注册，请先注册");
            return;
        }

        System.out.println("请输入身份证号码：");
        String personID = scanner.next();

        System.out.println("请输入手机号码：");
        String phoneNumber = scanner.next();

        User user = findUser(users, username);
        if (!(user.getPersonID().equals(personID) && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("身份证号码或手机号码输入有误，不能修改密码");
            return;
        }

        String newPassword;
        while (true) {
            System.out.println("请输入新的密码：");
            newPassword = scanner.next();
            System.out.println("请再次输入新的密码：");
            String comfirmNewPassword = scanner.next();
            if (newPassword.equals(comfirmNewPassword)) {
                break;
            }
            System.out.println("两次密码输入不一致，请重新输入");
        }

        user.setPassword(newPassword);
        System.out.println("密码修改成功");
    }

    private static void register(List<User> users) {
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();

            // 先验证格式是否正确，再验证是否唯一
            // 因为唯一性的验证的数据一般都是存储到数据库中的，如果我们要校验，则需要使用到网络资源
            boolean flag = checkUsername(username);
            if (!flag) {
                System.out.println("用户名格式不满足条件，需要重新输入");
                continue;
            }

            // 校验用户名是否唯一
            boolean exists = contains(users, username);
            if (exists) {
                System.out.println("用户名 " + username + " 已存在，请重新输入");
            } else {
                System.out.println("用户名 " + username + " 可用");
                break;
            }
        }

        // 2. 键盘录入密码
        // 键盘录入密码两次，两次密码一致才可以注册
        String password;
        while (true) {
            System.out.println("请输入要注册的密码：");
            password = sc.next();
            System.out.println("请再次输入要注册的密码：");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码一致，继续录入其他数据");
                break;
            }
            System.out.println("两次密码输入不一致，请重新输入");
        }

        // 3. 键盘录入身份证号码
        String personID;
        while (true) {
            System.out.println("请输入身份证号码：");
            personID = sc.next();
            boolean isPersonIDValid = checkPersonID(personID);
            if (isPersonIDValid) {
                System.out.println("身份证号码满足要求");
                break;
            }
            System.out.println("身份证号码格式有误，请重新输入");
        }

        // 4. 键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            boolean isPhoneNumberValid = checkPhoneNumber(phoneNumber);
            if (isPhoneNumberValid) {
                System.out.println("手机号码满足要求");
                break;
            }
            System.out.println("手机号码格式有误，请重新输入");
        }
        users.add(new User(username, password, personID, phoneNumber));
        System.out.println("用户注册成功");

        // 遍历集合
        printList(users);
    }

    private static void login(List<User> users) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            // 判断用户名是否存在
            boolean exists = contains(users, username);
            if (!exists) {
                System.out.println("用户名 " + username + " 未注册，请先注册再进行登录");
                return;
            }

            System.out.println("请输入密码：");
            String password = scanner.next();

            while (true) {
                String code = getCode();
                System.out.println("当前正确的验证码为：" + code);
                System.out.println("请输入验证码：");
                String inputCode = scanner.next();
                if (inputCode.equalsIgnoreCase(code)) {
                    System.out.println("验证码正确");
                    break;
                }
                System.out.println("验证码错误");
            }

            // 验证用户名和密码是否正确
            boolean result = checkUserInfo(users, new User(username, password, null, null));
            if (result) {
                System.out.println("登录成功，可以开始使用学生管理系统了");
                new StudentManagement().start();
                break;
            } else {
                System.out.println("登录失败，用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账号：" + username + " 被锁定，请联系黑马程序员客服：XXX-XXXXX");
                    return;
                } else {
                    System.out.println("用户名或密码错误，还剩下：" + (2 - i) + "次机会");
                }
            }
        }
    }

    public static boolean checkUsername(String username) {
        // 用户名长度必须在3-15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        // 必须是字母加数组的组合，不能为纯数字
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        // 纯数字校验
        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    public static boolean contains(List<User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPersonID(String personID) {
        // 长度18位
        if (personID.length() != 18) {
            return false;
        }

        // 不能以0开头
        if (personID.startsWith("0")) {
            return false;
        }

        // 前17位必须都是数字
        for (int i = 0; i < personID.length(); i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        // 最后一位可以是数字，也可以是大写或小写的x
        char endChar = personID.charAt(personID.length() - 1);
        return (endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X');
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        // 长度必须是11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        // 不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        // 必须全是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void printList(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(user.getUsername() + "," + user.getPassword() + "," + user.getPersonID() + "," + user.getPhoneNumber());
        }
    }

    public static String getCode() {
        // 创建一个集合添加所有的大小写字母
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chars.add((char) ('a' + i));
            chars.add((char) ('A' + i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        // 随机抽取4个字母
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            // 获取随机索引
            int randomIndex = random.nextInt(chars.size());
            // 利用随机索引获取字母
            char c = chars.get(randomIndex);
            // 把随机字母添加到结果中
            stringBuilder.append(c);
        }

        // 随机生成数字
        int randomNumber = random.nextInt(10);
        // 将随机生成的数字添加到结果集的末尾
        stringBuilder.append(randomNumber);

        // 将随机生成的数字位置打乱
        char[] charArray = stringBuilder.toString().toCharArray();
        // 随机生成数字将要替换的下标
        int randomIndex = random.nextInt(charArray.length);
        // 对数字的位置进行替换
        char temp = charArray[randomIndex];
        charArray[randomIndex] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = temp;
        return new String(charArray);
    }

    public static boolean checkUserInfo(List<User> users, User userInfo) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public static User findUser(List<User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
