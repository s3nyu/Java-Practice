package Learn;
import java.util.Scanner;

public class pretestTiga {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input N : ");
        int N = input.nextInt();
        input.close();
        methodpiramid(N);
    }
    public static void methodpiramid(int N){
        for (int i = N; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print("* ");
            }
            System.out.println();
        }
    }
}



