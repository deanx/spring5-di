package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"one", "default"})
@Primary
public class GreetingServiceTwoImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from TwoImpl";
    }
}
