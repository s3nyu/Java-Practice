package Learn;
import java.util.Scanner;

public class LatLooping {
    public static void main(String[] args){

        int nilaiAwal,nilaiAkhir,total;

        // while loop
        Scanner in = new Scanner(System.in);

        System.out.println(" ==== WHILE LOOP ==== ");
        System.out.print(" Masukkan nilai awal : ");
        nilaiAwal = in.nextInt();

        System.out.print(" Masukkan nilai akhir : ");
        nilaiAkhir = in.nextInt();

        total = 0;

        while( nilaiAwal <= nilaiAkhir ){
            total = total + nilaiAwal;
            System.out.println(" Ditambah " + nilaiAwal + " menjadi " + total );
            nilaiAwal++;
        }

        // for loop
        System.out.println(" ==== FOR LOOP ==== ");
        System.out.print(" Masukkan nilai awal : ");
        nilaiAwal = in.nextInt();

        System.out.print(" Masukkan nilai akhir : ");
        nilaiAkhir = in.nextInt();

        total = 0;

        for (; nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println(" Ditambah " + nilaiAwal + " menjadi " + total);
        }
        

        // do while loop
        System.out.println(" ==== DO WHILE LOOP ==== ");
        System.out.print(" Masukkan nilai awal : ");
        nilaiAwal = in.nextInt();

        System.out.print(" Masukkan nilai akhir : ");
        nilaiAkhir = in.nextInt();
        in.close();

        total = 0;
      
        

        do {
            total = total + nilaiAwal;
            System.out.println(" Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        } while ( nilaiAwal <= nilaiAkhir);
        


    }
    
}
