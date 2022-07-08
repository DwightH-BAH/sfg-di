package dee.sprongframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dee.sprongframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectController {

    @Qualifier("propertyInjectController")
    @Autowired
    public GreetingService greetingService;
    
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
