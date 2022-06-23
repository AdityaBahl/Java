//Notes-
//Some of the methods available in input stream classes are - 
// 1. int available() - provides no of bytes available in input
// 2. int read() - reads the next byte of data from the input stream
// 3. int read(byte b[]) - Reads b.length(max) bytes and stores them into array b
// 4. int read(byte b[],int off,int len) - Reads upto len bytes of data from the input stream into array b
// 5. void reset() - reset the stream position 
// 6. long skip(long n) - skips n byte of bytes
// 7. void close() - close the stream

//Some of the methods available in output stream classes are - 
// 1. void write(int b) - writes b to output stream
// 2. void write(byte b[]) - writes b.length bytes to this output stream
// 3. void write(byte b[],int off, int len) - writes len bytes from b starting at offset off to this output stream
// 4. void flush() - flushes buffered output bytes to be written out
// 5. void close() - close the stream

//There are 2 types of streams - byte and character stream
import java.io.*;

public class First {
    public static void main(String args[]) {
        FileInputStream in = null;
        FileOutputStream out = null;
        // FileReader inputReader=null; //for character stream
        // FileWriter outputWriter=null;//for character stream
        try {
            in = new FileInputStream("C:\\Users\\Adi\\Desktop\\codes\\java\\practice\\IO_Handling\\input.txt");
            out = new FileOutputStream("C:\\Users\\Adi\\Desktop\\codes\\java\\practice\\IO_Handling\\output.txt");
            // File created or overwritten if previously existed
            int c;// data is returned as int
            while ((c = in.read()) != -1)// check if end of file
            {
                out.write(c);// write to output file. lowest 8 bits hold byte data
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        // close all streams
        finally {
            try {
                if (in != null)// is file open?
                {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Unable to close" + e);
            }
        } // finally
    }// main
}// class