package dee.sprongframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dee.sprongframework.sfgdi.services.GreetingService;


@Controller
public class SetterInjectdController {
    
    private GreetingService greetingService;
    
    @Qualifier("setterInjectGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
