package dee.sprongframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dee.sprongframework.sfgdi.services.ConstructorGreetingService;

public class SetterInjectdControllerTest {

    SetterInjectdController controller;

    @BeforeEach 
    void setUp(){
        controller = new SetterInjectdController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
