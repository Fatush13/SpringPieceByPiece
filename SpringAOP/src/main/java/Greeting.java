import org.springframework.stereotype.Component;

@Component
public class Greeting {
    private String message;

    public void getMessage() {
        System.out.println("Glad to welcome You!\n" + message);
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("message is set");
    }

    public void greet() {
        System.out.println("Hello guest!");
    }
}
