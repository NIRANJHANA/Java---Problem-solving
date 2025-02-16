package Association.ManyToMany;
import java.util.*;

public class Student {
    private String name;
    private Set<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new HashSet<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public String getName() {
        return this.name;
    }

    public void showCourses() {
        System.out.print("List of courses" + name + "enrolled: ");

        for(Course course: courses) {
            System.out.print(course.getName() + " ");
        }

        System.out.println();
    }
}
