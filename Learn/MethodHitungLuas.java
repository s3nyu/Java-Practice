package Learn;
public class MethodHitungLuas {
  public static void main(String[] args){

    System.out.println(" ==== MENGHITUNG LUAS ==== ");


    luas(5,3);
  }

    /*public static int luas(int x, int y){
        int luas = x * y;
        System.out.println("luasnya adalah = " + luas);
        return luas;
        */

        public static int luas(int panjang, int lebar){
            int luas = (panjang * lebar);
            System.out.println(luas);
            return luas;
        }
    
    
  }
