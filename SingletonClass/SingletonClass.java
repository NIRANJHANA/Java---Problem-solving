package SingletonClass;

// Lazy initialization
public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass(){}

    public static synchronized SingletonClass getInstance(){
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;
    }

}

// Eager initialization -> synchronized not required
/*
public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return instance;
    }

}
*/