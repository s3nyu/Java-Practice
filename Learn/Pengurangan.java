package Learn;
import java.util.Scanner;

public class Pengurangan{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        int A = in.nextInt();

        System.out.println("Masukkan angka kedua");
        int B = in.nextInt();

        int C = A - B;
        System.out.println(" Hasil dari " + A + " dikurang " + B + " adalah " + C);

        in.close();
    
    }
}
