package Learn.FinalPublicPrivateKeyword;

public class Main {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Leafa", 100.0);
        IntelHero hero2 = new IntelHero("Eruly", 50.0);

        hero1.display();
        hero2.display();
        System.out.println(" ");

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
        System.out.println(" ");

        hero1.setHealth(120);
        hero2.setHealth(80);

        hero1.display();
        hero2.display();
        System.out.println(" ");

        hero1.setHealth("reset");
        hero1.display();

        hero2.setHealth("reset");
        hero2.display();

    }
    
}
