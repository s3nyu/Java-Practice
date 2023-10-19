package Learn;
import java.util.Scanner;

public class ScannerNextLineDanNext {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== nextLine ===");
        System.out.print("insert your name : ");
        String name = sc.nextLine();
        System.out.println("Name : " + name);

        System.out.println("\n=== next ===");
        System.out.print("insert your name : ");
        String Name = sc.next();
        System.out.println("Name : " + Name);

        //note : kalau nextLine ditaruh dibawah bakal ke skip, gatau knp

        sc.close();
    }
    
}
