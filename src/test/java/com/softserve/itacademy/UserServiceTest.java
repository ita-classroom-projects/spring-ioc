package com.softserve.itacademy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

import com.softserve.itacademy.model.User;
import com.softserve.itacademy.service.UserService;


public class UserServiceTest {
    private static UserService userService;

    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        AnnotationConfigApplicationContext annotationConfigContext = new AnnotationConfigApplicationContext(Config.class);
        userService = annotationConfigContext.getBean(UserService.class);
        annotationConfigContext.close();
    }

    @Test
    public void checkAddUser() {
        User user = null;       // TODO, update code
        User expected = null;   // TODO, update code
        User actual = userService.addUser(user);
        assertEquals(expected, actual, "check message");
    }

    // TODO, other tests
}
