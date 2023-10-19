package Learn;
import java.util.ArrayList;

public class ArrayListKuliah {
    public static void main(String[] args){
//      ArrayList ukuran nya bisa berubah, sedangkan array biasa gabisa

//      arrayList of String          
        ArrayList<String> cars = new ArrayList<String>();
        cars.add(" Toyota ");
        cars.add(" Daihatsu ");
        cars.add(" Pajero ");
        cars.add(" Suzuki ");

        System.out.println("Array list cars : " + cars);

//      arrayList of Integer
//      array list tdk bisa menggunakan data primitif,jadi harus diubah dullu
//      misal int --> Integer || double --> Double
//      sebenarnya tdk diisi tdk apa, jadi array listnya hanya akan grow ketika lebih dari 10
        ArrayList<Integer> nilaiUTS = new ArrayList<Integer>(10);
//      gapake " " kalau data Integer
        nilaiUTS.add(95);
        nilaiUTS.add(77);
        nilaiUTS.add(84);  

        System.out.println("Array list nilaiUTS : " + nilaiUTS);

//      cara ngecek ukuran array list
//      kalau array biasa pake length, klo arraylist pake size  
        System.out.println(" ==== CEK SIZE ArrayList ==== ");
        System.out.println("Ukuran Array List cars adalah " + cars.size());
        System.out.println("Ukuran Array List nilaiUTS adalah " + nilaiUTS.size());
    }
}
