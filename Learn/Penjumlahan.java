package Learn;
import java.util.Scanner;

public class Penjumlahan{
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    System.out.println("Masukkan angka pertama");
    double A=in.nextDouble();

    System.out.println("Masukkan angka kedua");
    double B=in.nextDouble();

    System.out.println("Masukkan angka ketiga");
    double C=in.nextDouble();

    double D=A+B+C;
    System.out.println(" Hasil dari "+ A + " ditambah dengan "+ B + " dan ditambah dengan " + C + " Adalah "+ D);


    in.close();
    
 }
}
