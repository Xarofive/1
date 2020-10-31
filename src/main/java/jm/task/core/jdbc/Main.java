package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("32as33d", "12s22ad2", (byte) 12);
//        userService.removeUserById(1);
//        userService.getAllUsers();
//        userService.dropUsersTable();

    }
}
