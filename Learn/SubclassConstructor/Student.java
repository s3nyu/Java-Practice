package Learn.SubclassConstructor;

public class Student {
    
    String name;
    double atk;

    Student(){
        // bikin constructor kosong agar constructor di subclass tidak error
    }

    Student(String name, double atk){
        this.name = name;
        this.atk = atk;
    }

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("ATK : " + this.atk);
        
    }
}
