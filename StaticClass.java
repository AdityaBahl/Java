class Boxx {// counting objects using static variable
    int width;
    int height;
    static int numberOfBoxes = 0;// static

    Boxx() {
        width = 10;//width
        height = 20;//height
        numberOfBoxes++;// accessed in non static method
    }

    void howmanyBoxes() {
        System.out.println(numberOfBoxes);
    }
}

public class StaticClass {
    public static void main(String args[]) {
        // static members are independent of the objects
        // variables, methods and initializatin block can be static
        // static declared by 'static' keyword
        // also used for importing static members of a class
        // used for a variable to reflect changes everywhere
        Boxx ob1 = new Boxx();
        ob1.howmanyBoxes();
        Boxx ob2 = new Boxx();
        ob2.howmanyBoxes();
    }
}
