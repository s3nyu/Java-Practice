package Learn;

public class Praktikum13 {
    public static void main(String[] args){

    cobaAbs();
    cobaMaxDanMin();
    cobaCeilDanFloor();
    }

      static void cobaAbs(){
       int x = -5;
       int y = Math.abs(x);

       System.out.println("Nilai absolute dari " + x + " adalah " + y);
  }

      static void cobaMaxDanMin(){
        int x = 5;
        int y = 7;
  
        System.out.println("Nilai max dari " + x + " dan "+ y + " adalah " + Math.max(x,y));   
        System.out.println("Nilai min dari " + x + " dan "+ y + " adalah " + Math.min(x,y));   
 }

       static void cobaCeilDanFloor(){
         double x = 423.3267;

         System.out.println("Nilai ceil dari " + x + " adalah " + Math.ceil(x));   
         System.out.println("Nilai floor dari " + x +  " adalah " + Math.floor(x));   
}
}
