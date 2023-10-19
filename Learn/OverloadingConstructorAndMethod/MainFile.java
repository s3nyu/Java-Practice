// intinya mau bikin method sama tpi dengan kelakuan yang beda(parameter beda)

package Learn.OverloadingConstructorAndMethod;

public class MainFile {
    public static void main(String[] args){

        // constructor
        Player player1 = new Player("YUYU");
        Player player2 = new Player();
        Player player3 = new Player("JUJU");
        Player player4 = new Player();

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // cara 1
        int a = Matematika.tambah(1,19);
        System.out.println(a);

        // cara 2
        System.out.println(Matematika.tambah(1, 1.5));
    }
}
