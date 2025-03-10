package com.softserve.itacademy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.softserve.itacademy.service.UserService;

@ExtendWith(SpringExtension.class)
public class ToDoServiceTest {

    private UserService userService;
    private AnnotationConfigApplicationContext annotationConfigContext;

    @BeforeEach
    public void setup() {
        annotationConfigContext = new AnnotationConfigApplicationContext(Config.class);
        userService = annotationConfigContext.getBean(UserService.class);
    }

    @AfterEach
    public void tearDown() {
        annotationConfigContext.close();
    }

    @Test
    public void checkAddToDo() {
        Assertions.assertNotNull(userService);
    }

    // TODO: other tests
}

