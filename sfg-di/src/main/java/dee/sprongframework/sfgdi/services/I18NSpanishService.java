package dee.sprongframework.sfgdi.services;

import org.springframework.context.annotation.Profile;

@Profile({"ES","default"})
//@Service("i18nService")
public class I18NSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
