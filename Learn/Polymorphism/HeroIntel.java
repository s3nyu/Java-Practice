package Learn.Polymorphism;

public class HeroIntel extends Hero {
    String type = "Intel";

    HeroIntel(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
