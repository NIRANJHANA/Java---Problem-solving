package Inheritance;

public class MikesMorales extends SpiderMan {
     
    public MikesMorales(String name, String power){
        super(name, power);
    }

    @Override
    public void climbWall(){
        System.out.println(name + " can climb walls");
        super.climbWall();
    }
    public void character(){
        System.out.println(name + " is clever");
    }

    public void milesMethod(){
        System.out.println("miles method");
    }
}
