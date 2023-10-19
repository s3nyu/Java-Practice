package Learn;
import java.util.Arrays;
import java.util.Scanner;

public class KamusIndoEng {
    public static void main(String[] args){
    

        Scanner in = new Scanner(System.in);
        int a;

        do {
        String[] Indo = {"satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh"};
        String[] Eng = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        System.out.println("1. Indo -> Eng");
        System.out.println("2. Eng -> Indo");
        System.out.println("3. close");

        System.out.print("pilih jalur bahasa yang mau di translate : ");
        a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println(Arrays.toString(Indo));
                System.out.print("\nAngka yang mau ditanslate [1-10] : ");
                String pilihanUser = in.next();

                switch (pilihanUser){
                    case "satu":
                    System.out.println(Indo[0] + " adalah " + Eng[0]);
                    break;

                    case "dua":
                    System.out.println(Indo[1] + " adalah " + Eng[1]);
                    break;

                    case "tiga":
                    System.out.println(Indo[2] + " adalah " + Eng[2]);
                    break;

                    case "empat":
                    System.out.println(Indo[3] + " adalah " + Eng[3]);
                    break;

                    case "lima":
                    System.out.println(Indo[4] + " adalah " + Eng[4]);
                    break;

                    case "enam":
                    System.out.println(Indo[5] + " adalah " + Eng[5]);
                    break;

                    case "tujuh":
                    System.out.println(Indo[6] + " adalah " + Eng[6]);
                    break;

                    case "delapan":
                    System.out.println(Indo[7] + " adalah " + Eng[7]);
                    break;

                    case "sembilan":
                    System.out.println(Indo[8] + " adalah " + Eng[8]);
                    break;

                    case "sepuluh":
                    System.out.println(Indo[9] + " adalah " + Eng[9]);
                    break;
                    
                default:
                    System.err.println("maaf,input tidak ada dalam kamus\npastikan anda memasukkan input sesuai dengan isi kamus");
                }
                break;

            case 2:
            System.out.println(Arrays.toString(Eng));
                System.out.print("\nAngka yang mau ditanslate : ");
                String userOption = in.next();

            switch (userOption){
                case "one":
                System.out.println(Eng[0] + " adalah " + Indo[0]);
                break;

                case "two":
                System.out.println(Eng[1] + " adalah " + Indo[1]);
                break;

                case "three":
                System.out.println(Eng[2] + " adalah " + Indo[2]);
                break;

                case "four":
                System.out.println(Eng[3] + " adalah " + Indo[3]);
                break;

                case "five":
                System.out.println(Eng[4] + " adalah " + Indo[4]);
                break;

                case "six":
                System.out.println(Eng[5] + " adalah " + Indo[5]);
                break;

                case "seven":
                System.out.println(Eng[6] + " adalah " + Indo[6]);
                break;

                case "eight":
                System.out.println(Eng[7] + " adalah " + Indo[7]);
                break;

                case "nine":
                System.out.println(Eng[8] + " adalah " + Indo[8]);
                break;

                case "ten":
                System.out.println(Eng[9] + " adalah " + Indo[9]);
                break;
                
            default:
                System.err.println("maaf,input tidak ada dalam kamus\npastikan anda memasukkan input sesuai dengan isi kamus");
            }
            break;
         
            default:
                System.err.println("program dikeluarkan");
        }
      

    }while(a != 3);

    in.close();

    }

}

