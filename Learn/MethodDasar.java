package Learn;

// materi pengantar algoritma
public class MethodDasar {

    // prosedur(tdk mengembalikan nilai)
    public static void cetak(){
        System.out.println("Hello World");
    }

    public static void cetak2(){
        System.out.println("Hello SenYu");
    }

     // prosedur loop
     public static void loop(int x){
        for(int i=1; i<=x; i++);
        System.out.println("looping ke - " + x);
    }

    // fungsi(mengembalikan nilai)
    public static int angka(){
        return 5;
    }

    // fungsi utk menjumlahkan
    public static int penjumlahan(int a,int b){
        int hasil = a + b;
        System.out.println("Hasil penjumlahan dari " + a + " + " + b + " = " + hasil);
        return hasil;
    }

    // fungsi kuadrat
    public static int kuadrat(int x){
        int temp = x * x;
        System.out.println("hasil kuadrat dari " + x + " = " + temp);
        return temp;
    }

    public static void main(String[] args){

        cetak();
        cetak2();
        cetak();

        int x;
        // x akan tergantung pada fungsi yang diatas misal return 1, maka x = 1
        x = angka();
        System.out.println("x adalah = " + x);

        // perpangkatan
        double y = Math.pow(2,5);
        System.out.println("y adalah " + y);

        // penjumlahan
        penjumlahan(3,2);
        penjumlahan(5,7);
        penjumlahan(2000,3);
        
        // loop
        loop(12);

        // kuadrat
        kuadrat(2);
        kuadrat(3);
        kuadrat(4);
        

    }
    
}
