package Association.ManyToMany;
import java.util.*;

public class Course {
    private String name;
    private Set<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    public void enrollStudent(Student student){
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void showStudents() {
        System.out.print("List of students enrolled in " + name + ": ");

        for(Student student: students) {
            System.out.print(student.getName() + " ");
        }

        System.out.println();
    }
}
