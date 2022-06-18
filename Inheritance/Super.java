class Box {
    int size;

    Box() {
        size = 10;
    }

    Box(Box obj) {
        size = obj.size;
    }

    void display() {
        System.out.println("Super class(here Box class)'s size " + size);
    }
}

class RectBox extends Box {
    int width;

    RectBox() {
        super(); // Invokes Box(); must be first statement
        width = 20;
    }

    RectBox(RectBox obj) {
        super(obj); // Passing RectBox to Box
        width = obj.width;
    }

    void display() {
        System.out.println("Super size(calling from base class(here Rectbox)) + width = " + super.size + " " + width);
        // OR
        super.display(); // display of box
        System.out.println(" " + width);
        // Lets analyse the code below:

        // Box.size=20;//box rather than super
        // Box.display();

        // ITS WRONG! Name of class can be used only if the method or variable is static
    }
}

// super is also used to access the members of the base class from sub class
public class Super {
    public static void main(String args[]) {
        RectBox rObj1 = new RectBox();
        RectBox rObj2 = new RectBox(rObj1);// parameterized
        rObj1.display();
    }
}
