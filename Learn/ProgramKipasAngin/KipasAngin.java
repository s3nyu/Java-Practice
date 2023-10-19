package Learn.ProgramKipasAngin;

public class KipasAngin {
    
    String warna;
    boolean kondisi;
    int speed;
    double radius;

    KipasAngin(String warna, boolean kondisi, int speed, double radius){
        this.warna = warna;
        this.kondisi = kondisi;
        this.speed = speed;
        this.radius = radius;
    }

    void setWarna(String warna){
        this.warna = warna;
    }

    void setSpeed(int speed){
        this.speed = speed;
        if(speed == 1){
            System.out.println("slow");
        } else if (speed == 2){
            System.out.println("medium");
        } else if (speed == 3){
            System.out.println("fast");
        } else {
            System.out.println("Speed unidentified");
        }

       

    }
}
