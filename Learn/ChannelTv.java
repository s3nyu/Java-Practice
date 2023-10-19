package Learn;
import java.util.Scanner;

public class ChannelTv {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println(" ==== CHANNEL TV ==== ");
        System.out.println(" 1. TV One ");
        System.out.println(" 2. RCTI ");
        System.out.println(" 3. NET TV ");
        System.out.println(" 4. Metro TV ");
        System.out.println(" 5. Indosiar ");
        System.out.println(" 0. NO Channel ");

        System.out.print(" Pilihan : ");
        int a = in.nextInt();

        if (a==1){
            System.out.println(" TV ONE ALWAYS NUMBER ONE ");
        } else if (a==2){
            System.out.println(" RCTI OKEE ");
        } else if (a==3){
            System.out.println(" NET TV");
        } else if (a==4){
            System.out.println(" METRO TV ");
        } else if (a==5){
            System.out.println(" INDOSIAR ");
        } else if (a==0){
            System.out.println(" NO CHANNEL ");
        } else if (a % 5 == 0){
            System.out.println(" INDOSIAR ");
        } else {
            int b = a % 5;
            System.out.println(b);
        }

        in.close();


    }   
}
