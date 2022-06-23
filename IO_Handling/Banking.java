
//storage  and retrieval of objects on disks(secondary memory like hdd/file)
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Box implements Serializable {
    int width;
    int height;

    Box(int a, int b) {
        width = a;
        height = b;
    }

    void display() {
        System.out.println("width= " + width + " and height=" + height);
    }
}// end of class

public class Banking {
    public static void main(String[] args) {// throws exception
        Box obj1 = new Box(10, 20);
        obj1.display();
        Box obj2 = new Box(30, 40);
        obj2.display();
        Box obj3;// reference
        // create ObjectOutputStreams for writing objects
        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\Adi\\Desktop\\codes\\java\\practice\\IO_Handling\\object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // write objects
        oos.writeObject(obj1);// write the object
        oos.writeObject(obj2);
        oos.flush();
        oos.close();// close the stream
        // Now read and display again
        FileInputStream fin = new FileInputStream(
                "C:\\Users\\Adi\\Desktop\\codes\\java\\practice\\IO_Handling\\object.dat");
        ObjectInputStream oin = new ObjectInputStream(fin);
        obj3 = (Box) oin.readObject();// Need Typecasting
        obj3.display();
        obj3 = (Box) oin.readObject();// Need Typecasting
        obj3.display();
        oin.close();// Close stream closes both oin as well as fin
    }
}// Need to add try and catch and other constructs
