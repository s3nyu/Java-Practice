package Learn.InheritanceSuper;

public class HeroTank extends Hero {
    String name = "Class Strength";

    void display(){
        System.out.println("ini adalah " + this.name);
        this.dummyMethod();                             // memakai dummyMethod di subclass(HeroTank)
    }

    void displaySuper(){
        System.out.println("ini adalah " + super.name);
        super.dummyMethod();                            // memakai dummyMethod di superclass(Hero)
    }

    void dummyMethod(){
        System.out.println("method ini ada di subclass\n");
    }
}
