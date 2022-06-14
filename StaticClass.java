public class StaticClass {
    public static void main(String args[]) {
        // static members are independent of the objects
        // variables, methods and initializatin block can be static
        // static declared by 'static' keyword
        // also used for importing static members of a class
        // used for a variable to reflect changes everywhere
        Box ob1 = new Box();
        ob1.howmanyBoxes();
        Box ob2 = new Box();
        ob2.howmanyBoxes();
    }
}
