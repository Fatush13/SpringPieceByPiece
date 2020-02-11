import org.springframework.context.annotation.Bean;

public class CustomEventConfig {

    @Bean
    public CustomEventHandler customEventHandler(){
        return new CustomEventHandler();
    }

    @Bean
    public CustomEventPublisher customEventPublisher(){
        return new CustomEventPublisher();
    }
}