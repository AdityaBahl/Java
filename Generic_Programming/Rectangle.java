class RectGen<T> {// single type parameter T
    private T method;
    private T width;

    RectGen(T l, T w) {
        length = l;
        width = w;
    }

    T getLength() {
        return length;
    }

    T getWidth() {
        return width;
    }

    T calculateArea() {
        return length * width;
    }
}

public class Rectangle {
    public static void main(String args[]) {
        // Rectangle of Integer(Autoboxing and Unboxing)
        RectGen<Integer> obj1 = new RectGen<Integer>(10, 20);
        int iwidth = obj1.getLength();// Auto Unboxing
        int ilength = obj1.getWidth();
        int area = obj1.calculateArea();
        System.out.println("Length= " + ilength + " Width= " + iwidth);
        System.out.println("Area= " + ilength * iwidth);// imp to note
        System.out.println("Area= " + area);

        // Rec
    }
}