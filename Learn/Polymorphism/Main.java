package Learn.Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Jean");
        HeroStrength hero2 = new HeroStrength("Shenhe");

        hero1.display();
        hero2.display();

        // polymorphic
        Hero hero3 = new HeroAgility("Sayu");
        //ini bisa karena HeroAgility mengextends Hero, tipe nya tetap HeroAgility
        hero3.display();
        
        // heroIntel hero4 = new Hero("Eula");
        // ini gak bisa krn Hero belum tentu HeroIntel

        HeroAgility hero4 = new HeroAgility("Eula");
        hero4.display();
        hero4.showoff();

        // array list
        System.out.println("\n==== ARRAY LIST ====");
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;    // casting dari HeroAgility menjadi Hero

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        // method calls
        // kumpulanHero[3].showoff();   tidak bisa krn hero4 sudah jadi Hero, bukan heroAglity lagi
        hero4.showoff();    // kalau begini bisa karena memanggil langsung hero4, bukan kumpulanHero[3]

        // pengaplikasian
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);
        // semua hero akan bisa di attack meski tipe hero nya berbeda, karena semua masih termasuk Hero(liat method attack)


    }
}
