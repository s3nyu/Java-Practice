package Learn;
import java.util.Scanner;

public class SistemRaport {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.print(" Masukkan nilai(angka): ");
        int i = in.nextInt();
        in.close();

        MethodNilai(i);
    
    }

    public static void MethodNilai(int n){
        if (n >= 0 && n <= 30) {
            System.out.println("Nilai anda E");
        } else if (n > 30 && n <= 50) {
            System.out.println("Nilai anda D");
        } else if (n > 50 && n <= 70) {
            System.out.println("Nilai anda C");
        } else if (n > 70 && n <= 80) {
            System.out.println("Nilai anda B");
        } else if (n > 80 && n <= 100) {
            System.out.println("Nilai anda A");
        } else {
            System.out.println("Input salah!");


    }
    
  }
}
