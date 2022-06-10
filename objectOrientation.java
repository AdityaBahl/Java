class box {
    double width;
    double height;
    double depth;
}

public class objectOrientation {
    public static void main(String[] args) {
        box mybox = new box(); // reference referring to address of object
        System.out.println("Values are ");
        System.out.println(mybox.width + " " + mybox.height + " " + mybox.depth);
        // should print 0 0 0, now
        // assign values to class objects
        mybox.width = 20.5;
        mybox.height = 12.5;
        mybox.depth = 26.3;
        // calculating volume
        double volume = mybox.width * mybox.height * mybox.depth;
        // print volume
        System.out.println("Volume = " + volume);
    }
}