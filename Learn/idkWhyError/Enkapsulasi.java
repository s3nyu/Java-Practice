package Learn.idkWhyError;


    class Player{
        private String name;
        private int baseHealth;
    

    public Player(String name){
        this.name = name;
        this.baseHealth=100;
    }

    public void display(){
        System.out.println("Player : " + this.name);
        System.out.println("Health : " + this.baseHealth);
    }
}

public class Enkapsulasi {
    public static void main(String[] args){

        Player player1 = new Player("Irvia");
        player1.display();
        System.out.println("\n");

        Player player2 = new Player("Yuyu");
        player2.display();

        // player1.baseHealth = 10; (tidak bisa karena private)
    }
}
