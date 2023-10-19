package Learn.SubclassConstructor;

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Miyu");
        student1.display();

        SRT student2 = new SRT("Miyako", 80);
        student2.display();

        Student student3 = new Student("Saki", 70);
        student3.display();
    }
}
