package Learn;
import java.util.Scanner;

public class SoalEmpatUtsAlgo {
    public static void main(String[] args){



                Scanner userInput = new Scanner(System.in);
                int i,j,x = 1, y =0, z=0;
                System.out.print("masukkan N = ");
                int N = userInput.nextInt();
                
            for(i=1; i<=N; i++){
        
                for(j=1; j<=i; j++){
                    System.out.print(x + " ");
                    z = x;
                    x = y;
                    y = z;
                }
                System.out.println();
            }
            }
        } 
        


