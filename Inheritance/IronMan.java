package Inheritance;
 
// child class
public class IronMan extends SuperHero {

    public IronMan(String name, String power){
        super(name, power);
    }
    
    public void fly(){
        System.out.println(name + "can fly with suits");
    }
}
