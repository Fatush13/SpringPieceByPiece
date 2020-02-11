import java.util.List;

public interface StudentDao {

    public void addStudent(Student student);

    public void editStudent(int id, int age);

    public void deleteStudent(int id);

    public Student find(int id);

    public List<Student> findAll();
}
