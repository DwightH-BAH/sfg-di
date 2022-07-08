package dee.sprongframework.sfgdi.services;



public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello World - Constructor";
    }
    
}
