import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextEventHandler {

    @EventListener
    public void handleContextStoppedEvent(ContextStartedEvent event) {
        System.out.println("Handling context started event");
    }

    @EventListener
    public void handleContextStartedEvent(ContextStoppedEvent event){
        System.out.println("Handling context stopped event");
    }
}
