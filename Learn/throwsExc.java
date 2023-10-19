package Learn;

import java.util.*;
// * mengimport semua yang ada di java.util

public class throwsExc {
    public static void main(String[] args){

        int [] arrayData = {0,1,2,3};
//      panjang array = 4, tapi index cmn sampai 3

        Scanner in = new Scanner(System.in);
        System.out.print("data ke - : ");
        int indexInput = in.nextInt();

//  exception biasa
    System.out.println("==== EXCEPTION BIASA ====");
    try{                                          // dari scanner              nama array
        System.out.println("data dari array ke - " + indexInput + " adalah " + arrayData[indexInput]);
    } catch(Exception e){
        System.err.println(e);
    }
    System.out.println("");

// exception throws by method
    System.out.println("==== EXCEPTION THROWS BY METHOD ====");
    int data = 0;

    try{
        data = ambilData(arrayData, indexInput);
    } catch(Exception e){
        System.err.println(e);
    }

    System.out.println("data dari array ke - " + indexInput + " adalah " + data);
    System.out.println("");

    System.out.println("==== AKHIR PROGRAM ====");
    in.close();
    }

    private static int ambilData(int[] array,int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }
    
}
