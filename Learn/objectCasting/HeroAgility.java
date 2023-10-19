package Learn.objectCasting;

public class HeroAgility extends Hero {
    String type;

    HeroAgility(String name, double health){
        super(name,health);
        this.type = "Agility";
    }

    public void display(){
        System.out.println(this.getName() + " is an " + this.type + " Hero");
    }
}
