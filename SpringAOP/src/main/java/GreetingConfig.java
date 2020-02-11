import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class GreetingConfig {

    @Bean
    public Greeting greeting() {
        return new Greeting();
    }

    @Bean
    public GreetingAOP greetingAOP() {
        return new GreetingAOP();
    }
}
