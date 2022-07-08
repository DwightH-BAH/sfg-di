package dee.sprongframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dee.sprongframework.sfgdi.services.ConstructorGreetingService;

public class ConstructorInjControllerTest {
    ConstructorInjController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjController(new ConstructorGreetingService());
    }

    @Test
    void testGetGreeting() {

    }
}
