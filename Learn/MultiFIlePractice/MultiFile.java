// jadi class nya akan terpisah dari main classnya
package Learn.MultiFIlePractice;

// import dari folder lain
import Learn.MultiFilePractice2.console;

class MultiFile {
    public static void main(String args[]) {

        Player player1 = new Player("Juju");
        Player player2 = new Player("Yuyu");

        player1.show();
        player2.show();

        console.log("Yoroshiku");
    }
    
}
