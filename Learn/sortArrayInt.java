package Learn;

import java.util.Arrays;

public class sortArrayInt {
    public static void main(String[] args) {
        
        int[] arrayAngka1 = {2,3,5,1,12,7,60,6,8,9};
        System.out.println(Arrays.toString(arrayAngka1));

        Arrays.sort(arrayAngka1);
        System.out.println("\nSetelah sorting");
        System.out.println(Arrays.toString(arrayAngka1));

        Arrays.parallelSort(arrayAngka1);
        System.out.println("\nSetelah parallel sorting, w gatau apa bedanya ama sort biasa");
        System.out.println(Arrays.toString(arrayAngka1));

    }
}
