package Learn;
import java.util.Scanner;

public class pretestEmpat {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.print(" Masukkan nilai(angka): ");
        int a = in.nextInt();
        in.close();

        MethodNilai(a);
    
    }

    public static void MethodNilai(int a){
        if (a <= 30 && a > 0){
            System.out.println("E");
        } else if (a <= 50 && a > 30){
            System.out.println("D");
        } else if (a <=70 && a > 50){
            System.out.println("C");
        } else if (a <= 80 && a > 70){
            System.out.println("B");
        } else if (a < 100 && a > 80){
            System.out.println("A");
        }


    }
    
}
