public class Student {
    private int s_id;
    private String s_name;
    private int s_age;

    public Student(int id, String name, int age) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_age = s_age;
    }

    public int getId() {
        return s_id;
    }

    public void setId(int id) {
        this.s_id = id;
    }

    public String getName() {
        return s_name;
    }

    public void setName(String name) {
        this.s_name = name;
    }

    public int getAge() {
        return s_age;
    }

    public void setAge(int age) {
        this.s_age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + s_id +
                ", name='" + s_name + '\'' +
                ", age=" + s_age +
                '}';
    }
}
