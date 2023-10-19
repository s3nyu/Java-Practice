package Learn.objectCasting;

public class Main {
    public static void main(String[] args) {
        
    // objek dgn class HeroIntel
        HeroIntel hero1 = new HeroIntel("Avrora",100);
        hero1.display();
        hero1.castMagic();

    // up casting
    Hero heroUp = (Hero) hero1;
    heroUp.display();
    // ada field dan method yg hilang
    // Sysout(heroUp.type); gabisa
    // heroUp.castMagic;    gabisa

    Hero heroReg = new Hero("ChenHai",100);
    heroReg.display();
    // down casting dari super ke sub gabisa
    // HeroAgility heroDown = (HeroAgility) heroReg;    gabisa
    // heroDown.display();                              gabisa

    //coba balikin yg di up casting ke semula
    HeroIntel hero2 = (HeroIntel) heroUp;

    // berhasil di down casting, syaratnya bentuk awalnya sama
    hero2.display();
    System.out.println(hero2.type);
    hero2.castMagic();

    }
}
