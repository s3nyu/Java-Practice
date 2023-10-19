package Learn.Polymorphism;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }

    void showoff(){
        System.out.println("Saya adalah Hero Agility!");
    }
}
