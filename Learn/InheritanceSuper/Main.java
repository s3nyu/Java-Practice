package Learn.InheritanceSuper;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        HeroTank hero2 = new HeroTank();

        hero1.display();        // Hero(superclass)                             1
        hero2.display();        // HeroTank(subclass)                           2
        hero2.displaySuper();   // refer ke Hero(super), bukan HeroTank(sub)    3


        /*
        output :
        1. ini adalah Class Hero

        2. ini adalah Class Strength
           method ini ada di subclass

        3. Ini adalah Class Hero
           method ini ada di superclass
        */
    }
}
