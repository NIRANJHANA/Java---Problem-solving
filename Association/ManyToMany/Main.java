package Association.ManyToMany;

public class Main {
    public static void main(String[] args) {
        // Many-Many -> student,course
        Student s1 = new Student("Manju");
        Student s2 = new Student("Niranjhana");
        Student s3 = new Student("Niran");


        Course c1 = new Course("Architecture");
        Course c2 = new Course("B.Tech");
        Course c3 = new Course("Phycology");


        s1.enrollCourse(c1);
        s1.enrollCourse(c3);
        s2.enrollCourse(c3);
        s3.enrollCourse(c1);
        s3.enrollCourse(c2);

        s1.showCourses();
        c3.showStudents();
    }
}
