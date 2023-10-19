package Learn.LatihanInheritance;

public class Student {
    // atribut
    String name;
    String type = "Basic";
    double attack, health;

    // constructor
    Student(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attack = attackInput;
        this.health = healthInput;
    }

    // method attack
    void attack(Student enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attack);
    }

    // method take damage
    void takeDamage(double damage){
        System.out.println(this.name + " receive " + damage + " damage");
        this.health = this.health - damage;
    }

    // method display
    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Attack : " + this.attack);
        System.out.println("Health : " + this.health);
        System.out.println("Type : " + this.type);

    }
}
