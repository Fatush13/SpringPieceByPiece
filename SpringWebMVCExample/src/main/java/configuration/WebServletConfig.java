package configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebServletConfig implements WebApplicationInitializer {

    public void onStartup(ServletContext context) throws ServletException {
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(HelloConfig.class);
        webContext.setServletContext(context);
        ServletRegistration.Dynamic servlet = context.addServlet("dispatcher", new DispatcherServlet(webContext));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
