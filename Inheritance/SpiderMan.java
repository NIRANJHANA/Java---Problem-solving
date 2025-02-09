package Inheritance;

public class SpiderMan extends SuperHero {
    
    public SpiderMan(String name, String power){
        super(name, power);
    }

    public void climbWall(){
        System.out.println(name + " can climb buildings");
    }

    public void character(){
        System.out.println(name + " is funny and causual");
    }

    public void petersMethod(){
        System.out.println("peter's method");
    }
}
