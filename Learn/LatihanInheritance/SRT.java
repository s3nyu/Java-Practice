package Learn.LatihanInheritance;

public class SRT extends Student {
    String type = "SRT";

    // subclass constructor
    SRT(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display(){
        // bisa pakai super.display(); atau bisa copas aja dri superclass
        System.out.println("\nName : " + this.name);
        System.out.println("Attack : " + this.attack);
        System.out.println("Health : " + this.health);
        System.out.println("Type : " + this.type);
    }

    @Override
    // method armor
    void takeDamage(double damage){
        System.out.println(this.name + " receive half damage " + damage + "-->" + damage/2);
        this.health = this.health - damage/2;
    }

}
