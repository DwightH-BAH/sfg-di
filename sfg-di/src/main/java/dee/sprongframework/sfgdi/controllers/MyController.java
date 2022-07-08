package dee.sprongframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    public String sayHEllo(){
        System.out.println("Hello World");

        return "Hi Folks!";
    }
}
