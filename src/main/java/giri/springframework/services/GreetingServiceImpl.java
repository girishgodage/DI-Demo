package giri.springframework.services;

public class GreetingServiceImpl implements GreetingService {

    public static  final  String HELLO_GIRI = "Hello Giri";
    @Override
    public String sayGreeting() {
        return HELLO_GIRI;
    }
}
