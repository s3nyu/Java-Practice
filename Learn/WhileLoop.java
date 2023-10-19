package Learn;

public class WhileLoop{

    public static void main(String[] args){

        int a = 0;
        boolean kondisi = true;

        System.out.println(" ==== AWAL PROGRAM ==== ");

        while ( kondisi ){
            System.out.println(" while loop ke - " + a);
            a++;

            if( a == 10){
                kondisi = false; 
            }
        }
    }
}