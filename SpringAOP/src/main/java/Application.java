import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GreetingConfig.class);

        Greeting greeting = context.getBean(Greeting.class);
        greeting.greet();
        greeting.setMessage("How was your day ?");
        greeting.getMessage();
    }
}
