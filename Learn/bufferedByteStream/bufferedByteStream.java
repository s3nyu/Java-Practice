package Learn.bufferedByteStream;
import java.io.*;
import java.util.Arrays;

public class bufferedByteStream {
    
    public static void main(String[] args) throws IOException {
        
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());
    }
}
