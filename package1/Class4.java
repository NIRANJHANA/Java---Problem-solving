package package1;

public class Class4 {
    static InnerClass4 obj1 = new InnerClass4();
    int var = 5;
    public static class InnerClass4 {
        InnerClass4(){
            Class4 obj = new Class4();
            System.out.println(obj.var);
        }
    }

}
