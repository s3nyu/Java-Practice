package Learn.IOStream;
import java.io.FileInputStream;
import java.io.IOException;

public class inputFile {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fileInput = new FileInputStream("input.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        
    }
}
