package Learn;

class Barang{
    String nama;
    int harga;
}

public class LatihanClassDanObject{
    public static void main (String[] args){

        Barang barang1 = new Barang();
        barang1.nama = "pensil";
        barang1.harga = 1000;

        Barang barang2 = new Barang();
        barang2.nama = "bolpoint";
        barang2.harga = 2000;

        Barang barang3 = new Barang();
        barang3.nama = "penghapus";
        barang3.harga = 500;

        total(10,10,20,"Ahmad");
        total(5,30,2,"Budi");

    }

    public static int total(int a,int b,int c,String pedagang){
    
         int total1 = a * 1000;
         int total2 = a * 2000;
         int total3 = a * 500;
        int total = total1 + total2 + total3;
         System.out.println("Total uang yang didapat " + pedagang + " adalah " + total);
         return total;
    }
}
