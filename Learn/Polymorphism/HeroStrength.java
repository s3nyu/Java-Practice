package Learn.Polymorphism;

public class HeroStrength extends Hero {
    String type = "Strength";

    HeroStrength(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
