import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingAOP {

       @After("execution(public void setMessage(String))")
    public void setMessageAdvice() {
        System.out.println("Executing advice after method setMessage()");
    }
}
