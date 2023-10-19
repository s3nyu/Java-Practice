package Learn;

import java.util.Scanner;
public class Array2d{
    public static void main(String[] args)
    {
        Scanner masuk =new Scanner (System.in);

        int jenisKamar, hargaKamar;
        int cari;
        boolean ketemu = false;

        System.out.print("Jumlah Kamar : ");
        int n = masuk.nextInt();

        String kamar[][] = new String[n][4];

        for(int i= 0; i<n; i++)
        {
            System.out.println("");
            System.out.println("Kamar ke "+(i+1));

            for(int j=0; j<2; j++)
            {
                if (j == 0)
                    System.out.print("Jenis Kamar     :");
                else
                    System.out.print("Harga kamar : ");

                System.out.print("");
                kamar[i][j] = masuk.next();
            }
        }

        System.out.println("Pilihan Kamar");
        System.out.println("-----------------------------");
        System.out.println("Jenis Kamar \t\t\t  Harga Kamar \t\t\t");

        for(int i=0;i<n;i++)
        {
            for(int j=0; j<2 ;j++)
            {
                System.out.print(kamar[i][j]+"\t\t");
            }
        System.out.println();
        }
    }
}
