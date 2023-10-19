package Learn;
import java.util.Scanner;

public class pembagian{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        float A=in.nextFloat();

        System.out.println("Masukkan angka kedua");
        float B=in.nextFloat();

        float C = A / B;
        System.out.println(" Hasil dari " + A + " dibagi " + B + " Adalah " + C);
        

        in.close();


}
}