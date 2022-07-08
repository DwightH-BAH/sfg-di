package dee.sprongframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dee.sprongframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjController {
    
    private final GreetingService greetingService;
    
    public ConstructorInjController (@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
