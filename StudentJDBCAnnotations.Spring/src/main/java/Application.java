import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentJdbc");

        System.out.println("Creating records for our database");
        Student Pavel = new Student("Pavel", 1, 24);
        Student Aleksandr = new Student("Aleksandr", 2, 25);
        Student Artem = new Student("Artem", 3, 29);

        System.out.println("Listing our records");
        List<Student> students = studentService.findAll();

        for (Student student : students) {
            System.out.println("Student's ID is " + student.getId());
            System.out.println("Student's name is " + student.getName());
            System.out.println("Student's age is " + student.getAge());
        }

        System.out.println("Updating records where id = 2");
        studentService.editStudent(2, 20);

        System.out.println("Listing records where id = 2");
        Student student = studentService.find(2);
        System.out.println("Student's id is " + student.getId());
        System.out.println("Student's name is " + student.getName());
        System.out.println("Student's age is " + student.getAge());

        context.close();
    }
}
