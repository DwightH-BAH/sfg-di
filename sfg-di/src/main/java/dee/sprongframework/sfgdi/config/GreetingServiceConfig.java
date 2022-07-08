package dee.sprongframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import dee.sprongframework.sfgdi.services.ConstructorGreetingService;
import dee.sprongframework.sfgdi.services.PrimaryGreetingService;
import dee.sprongframework.sfgdi.services.PropertyInjectedGreetingService;
import dee.sprongframework.sfgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {
    
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
