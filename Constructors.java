class box {
    double width;
    double height;
    double depth;

    box() {
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    box(double width, double height) {// this keyword
        this.width = w;
        this.height = h;
    }

    void setDim(double w, double h, double d) {// parameterized
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Constructors {
    public static void main(String[] args) {
        box mybox1 = new box();
        System.out.println(mybox1.width);
        System.out.println(mybox1.depth);
        System.out.println(mybox1.height);
        box mybox2 = new box(20.0, 30.0, 40.0);
        System.out.println(mybox2.width);
        System.out.println(mybox2.depth);
        System.out.println(mybox2.height);
    }
}
