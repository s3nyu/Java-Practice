package Learn.LatihanInheritance;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Azusa",10,100);
        SRT student2 = new SRT("Miyako",20,100);

        student1.display();
        student2.display();

        student1.attack(student2);
        student2.attack(student1);

        student1.display();
        student2.display();

    }
}
