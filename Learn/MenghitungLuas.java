package Learn;
import java.util.Scanner;

public class MenghitungLuas {
  public static void main(String[] args){

    Scanner userInput = new Scanner(System.in);
    // "userInput" bisa diganti menjadi "in" (nama variable)

    System.out.println(" ==== MENGHITUNG LUAS ==== ");

    System.out.print(" Masukkan Panjang : ");
    int panjang = userInput.nextInt();

    System.out.print(" Masukkan Lebar : ");
    int lebar = userInput.nextInt();

    int luas = (panjang * lebar);
    System.out.println(" Luas adalah " + luas);

    System.out.println(" ==== MENGHITUNG VOLUME ==== ");

    System.out.println(" Masukkan Tinggi ");
    int tinggi = userInput.nextInt();

    int volume = panjang * lebar * tinggi;
    System.out.println(" Volume adalah " + volume);
    
    userInput.close();
  }
}