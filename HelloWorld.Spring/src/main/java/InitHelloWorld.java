import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class InitHelloWorld implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization of a bean \"" + beanName + "\"");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization of a bean \"" + beanName + "\"");
        return bean;
    }
}