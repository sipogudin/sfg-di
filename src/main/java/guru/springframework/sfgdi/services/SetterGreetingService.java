package guru.springframework.sfgdi.services;

public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Setter";
    }
}
