package Inheritance;

// parent class
public class SuperHero {
    String name;
    String power;

    public SuperHero(String name, String power){
        this.name = name;
        this.power = power;
    }

    public void usePower(){
        System.out.println(name + " uses " + power);
    }
}
