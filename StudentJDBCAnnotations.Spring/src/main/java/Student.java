public class Student {
    private Integer age;
    private String name;
    private Integer id;

    public Student(String name, int id, int age) {
        super();
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student() {

    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
