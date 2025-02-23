package Constructors;
// import java.lang.*;

public class MyClass implements Cloneable {
    String name;
    int age;

    MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
