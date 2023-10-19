package Learn;

import java.util.LinkedList;

public class LinkedListRevivedWitch {
    public static void main(String[] args) {
        
        LinkedList <String> RW = new LinkedList <>();
        LinkedList <String> RW2 = new LinkedList <>();

        // add
        RW.add("Caledonia");
        RW.add("Akasha");

        //addFirst
        RW.addFirst("Ardisia");

        //addLast
        RW.addLast("Amanami");

        //add berdasarkan index
        RW.add(1, "Matveiffe");
        // note : index mulai dari 0

        //addAll utk menambahkan semua elemen ke list lain
        RW2.addAll(RW);

        //remove dari index
        RW.remove(0);

        //remove elemen 
        RW.remove("Akasha");

        //remove first dan last
        RW.removeFirst();
        RW.removeLast();

        //copy
        Object RW3 = RW.clone();

        //clear
        RW.clear();

        System.out.println("RW : " +RW);
        System.out.println("RW 2 : " + RW2);
        System.out.println("RW 3 : " + RW3);
    }
    
}
