package Learn;

        class Player{
            String name;                // this.name
            public int exp;             // this.exp
            private int health;         // this.health

            Player(String nama,int exp,int health){
                this.name = nama;
                this.exp = exp;
                this.health = health;
            }

// default modifier access
void display(){
    tambahExp();
    System.out.println("\nName : " + this.name);
    System.out.println("Exp : " + this.exp);
    System.out.println("Health : " + this.health);
}

// public
public void ubahName(String nameBaru){          // mengubah nama menggunakan method
    this.name = nameBaru;
}

// private
private void tambahExp(){
    this.exp = + 100;
}
        }
    

    public class PublicDanPrivateClass {
        public static void main(String[] args){

            Player player1 = new Player("Shun",0,100);

// default
System.out.println(player1.name);    // nama awal
player1.name = "Yuzu";
System.out.println(player1.name);    // nama setelah diubah( dari Shun -> Yuzu )

// public
System.out.println(player1.exp);
player1.exp = 100;
System.out.println(player1.exp);

// METHODS

// default
player1.display();

// public
player1.ubahName("Sayu");
player1.display();

// private
// player1.tambahExp(); [ ==== TDK BISA DIAKSES ==== ]

        }
    }

