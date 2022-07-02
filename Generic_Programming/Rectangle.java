class RectGen<T> {// single type parameter T
    private T length;
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
    // below not possible
    // T calculateArea() {
    // return length * width;
    // }
}

public class Rectangle {
    public static void main(String args[]) {
        // Rectangle of Integer(Autoboxing and Unboxing)
        RectGen<Integer> obj1 = new RectGen<Integer>(10, 20);
        int iwidth = obj1.getLength();// Auto Unboxing
        int ilength = obj1.getWidth();
        // int area1 = obj1.calculateArea();
        System.out.println("Length= " + ilength + " Width= " + iwidth);
        System.out.println("Area= " + ilength * iwidth);// imp to note
        // System.out.println("Area= " + area1);

        // Rectangle of float
        RectGen<Float> obj2 = new RectGen<Float>(10.2f, 20.3f);
        float fwidth = obj2.getLength();// Auto Unboxing
        float flength = obj2.getWidth();
        // float area2 = obj2.calculateArea();
        System.out.println("Length= " + flength + " Width= " + fwidth);
        System.out.println("Area= " + flength * fwidth);// imp to note
        // System.out.println("Area= " + area2);
    }
}