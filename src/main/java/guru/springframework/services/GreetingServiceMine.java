package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Profile("one")
@Service
public class GreetingServiceMine implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus from GreettingServiceImpl!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
