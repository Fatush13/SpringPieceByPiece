import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CustomEventConfig.class);

        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");

        customEventPublisher.publish();
        customEventPublisher.publish();
    }
}
