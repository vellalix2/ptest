package com.github_actions_demo.hello_world.web;


import com.github_actions_demo.hello_world.web.controllers.HelloWorldController;
import com.github_actions_demo.hello_world.web.responses.HelloWorldResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class HelloWorldControllerTests {

    @Autowired
    HelloWorldController helloWorldController;

    @Test
    public void testValidHelloWorld() {

        //Arrange
        String name = "Andrea";
        String surname = "Mangion";

        String expectedMessage = "Hello " + name + " " + surname + "!";

        //Act
        HelloWorldResponse helloWorldResponse = helloWorldController.get(name, surname);

        //Assert
        assertEquals(expectedMessage, helloWorldResponse.getMessage());

    }


}
