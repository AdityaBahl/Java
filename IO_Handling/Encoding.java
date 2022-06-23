import java.io.FileInputStream;
import java.io.FileOutputStream;

//types of text file encoding options:
//US-ASCII
//UTF-8
//UTF-16BE
//UTF-16LE

//to read text file appropriately use class:
// InputStreamReader(InputStream in,Charset cs)
public class Encoding {
    public static void main(String args[]) {
        FileInputStream fin = null;
        FileStreamReader in = null;
        // try{
        fin = new FileInputStream("FileUTF16BE.txt");
        in = new InputStreamReader(fin, "UTF-16BE");
        int c = 0;
        while ((c = in.read()) != -1) {
            System.out.println(c + "-->" + (char) c);
            // convert int to char: (char) c
            // You can also print the data in Binary using Integer class
        }
        // }
    }
}
