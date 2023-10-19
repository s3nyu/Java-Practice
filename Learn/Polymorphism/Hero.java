package Learn.Polymorphism;

public class Hero {
    String name;

    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("\nName \t: " + this.name);
    }

    void attack(Hero enemy){
        System.out.println("Menyerang");
    }
}
