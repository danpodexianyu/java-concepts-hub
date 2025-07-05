package org.example.practice.jigsaw.service;

import org.example.practice.jigsaw.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static final List<User> users = new ArrayList<>() {{
        add(new User("zhangsan", "123"));
        add(new User("lisi", "1234"));
    }};

    private UserService() {
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }

    public static boolean exists(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public static void register(String username, String password) {
        users.add(new User(username, password));
    }


}
