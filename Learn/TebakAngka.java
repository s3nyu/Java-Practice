package Learn;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.println(" ==== TEBAKAN SATU ==== ");
        System.out.print(" Masukkan nilai tebakan anda : ");
        nilaiTebakan = in.nextInt();
        System.out.println(" Nilai tebakan anda adalah : " + nilaiTebakan);

        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println(" Tebakan anda " + statusTebakan);


        System.out.println(" ==== TEBAKAN DUA ==== ");
        System.out.print(" Masukkan nilai diantara 4 dan 9 : ");
        nilaiTebakan = in.nextInt();

        statusTebakan = ( nilaiTebakan > 4 ) && ( nilaiTebakan < 9);
        System.out.println(" Tebakan Anda : " + statusTebakan);

        in.close();


    }
    
}
