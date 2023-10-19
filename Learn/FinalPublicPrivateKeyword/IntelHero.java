package Learn.FinalPublicPrivateKeyword;

public class IntelHero extends Hero {
    
    IntelHero(String name, double health){
        super(name, health);
    }

    // visibility harus sama dengan yang superclass
    public void display(){
        System.out.println(this.name + " mempunyai banyak " + this.getHealth());
    // System.out.println(this.name + " mempunyai banyak " + this.health);  tdk bisa krn health nya private
    }

    // coba override final setter(gabisa)
    // void setHealth(double newHealth){
    //    sysout("nyoba memasukkan health = " + newHealth);
    // }

    // overload bisa
    void setHealth(String newHealth){
        System.out.println("nyoba memasukkan health = " + newHealth);
    }

}
