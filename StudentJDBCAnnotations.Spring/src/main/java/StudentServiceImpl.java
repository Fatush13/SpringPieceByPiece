import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void editStudent(int id, int age) {
        studentDao.editStudent(id, age);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public Student find(int id) {
        return studentDao.find(id);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

}
