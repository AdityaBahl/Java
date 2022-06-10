class box {
    double width;
    double height;
    double depth;
}

class fishtank {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is: " + (width * height * depth));
    }
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
        fishtank tank = new fishtank();
        tank.width = 10.0;
        tank.height = 20.0;
        tank.depth = 30.0;
        tank.volume();
    }
}