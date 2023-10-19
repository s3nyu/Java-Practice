package Learn;
import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args)throws Exception{

        Scanner in = new Scanner(System.in);

        System.out.println(" ==== START ==== ");
        float Hasil;
        int opt;

    do{
        System.out.println("\n --- Kalkulator Sederhana --- ");
        System.out.println("1. Open Program");
        System.out.println("2. Close Program ");
        System.out.print("Option : ");
        opt = in.nextInt();

        System.out.print("\nMasukkan Angka pertama : ");
        float A = in.nextFloat();

        System.out.println("\n ==== OPERASI ARITMATIKA ==== ");
        System.out.println(" 1. X ( KALI ) ");
        System.out.println(" 2. : ( BAGI ) ");
        System.out.println(" 3. + ( TAMBAH ) ");
        System.out.println(" 4. - ( KURANG ) ");
        System.out.println(" 5. % ( MODULUS ) ");

        System.out.print("\nPilih operasi aritmatika : ");
        int B = in.nextInt();

        System.out.print("\nMasukkan Angka kedua : ");
        float C = in.nextFloat();

        if(B == 1){
         Hasil = A * C;
        } else if(B == 2){
            Hasil = A / C;
        } else if(B == 3){
            Hasil = A + C;
        } else if(B == 4){
            Hasil = A - C;
        } else {
            Hasil = A % C;
        }
        
        System.out.println("\n Hasil : " + Hasil);
        
    } while(opt != 2);
    
    System.out.println(" ==== FINISH ==== ");
    in.close();
    }  
}
