import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("studentJdbc")
public class StudentJDBCTemplate implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String SQL = "insert into Students (id, name, age) values (?, ?, ?)";
        jdbcTemplate.update(SQL, student.getId(), student.getName(), student.getAge());
        System.out.println("Create record name = " + student.getName() + " Age = " + student.getAge());
    }

    public Student find(int id) {
        String SQL = "select * from Students where id = ?";
        Student student = (Student) jdbcTemplate.queryForObject(
                SQL, new Object[]{id}, new BeanPropertyRowMapper(Student.class));

        return student;
    }

    public List<Student> findAll() {
        String SQL = "select * from Students";
        List<Student> students = jdbcTemplate.query(SQL, new BeanPropertyRowMapper(Student.class));
        return students;
    }

    public void deleteStudent(int id) {
        String SQL = "delete from Students where id =?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Deleted record where ID = " + id);
    }

    public void editStudent(int id, int age) {
        String SQL = "update Students set age = ? where id =?";
        jdbcTemplate.update(SQL, age, id);
        System.out.println("Update record where id = " + id);
    }
}
