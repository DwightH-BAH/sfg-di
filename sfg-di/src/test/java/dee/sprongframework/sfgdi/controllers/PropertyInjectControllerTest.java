package dee.sprongframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dee.sprongframework.sfgdi.services.ConstructorGreetingService;

public class PropertyInjectControllerTest {
    PropertyInjectController controller;

    @BeforeEach
    void setup() {
        controller = new PropertyInjectController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
