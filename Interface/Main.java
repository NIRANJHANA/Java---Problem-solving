package Interface;

public class Main {
    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();

        obj.commonAbstratcMethod();
        obj.abstratcMethod_A();
        obj.abstratcMethod_B();

        obj.commonDefaultMethod();
        obj.defaultMethod_A();
        obj.defaultMethod_B();

        Interface_A.staticMethod();
    }
}
