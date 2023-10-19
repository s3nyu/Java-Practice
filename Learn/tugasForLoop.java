package Learn;
import java.util.Scanner;

public class tugasForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        System.out.print("Masukkan Bilangan : ");
        int c = input.nextInt();
        
        for( int i = c ; i > 0; i--){
            if(i==1){
                System.out.print(i);
            } else{
                System.out.print(i + " + ");
            }
            count = count+i;
        }
        System.out.println(" ");
        System.out.println("Total Nilai : " + count);
    }
}
