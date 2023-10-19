package Learn;

public class BintangKotakSegitiga {
    public static void main(String[] args){

    System.out.println(" ==== KOTAK ==== ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    System.out.println(" ==== SEGITIGA 1 ==== ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.println("");
        }


    System.out.println(" ==== SEGITIGA 2 ==== ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i + j == 4){
                    break;
                }
            }
            System.out.println("");
        }

    System.out.println(" ==== SEGITIGA 3 ==== ");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("* ");
                if( i == j){
                    break;
                } else if((i+j) == 8){
                    break;
                }
            }
            System.out.println("");

        }    
    }
}

