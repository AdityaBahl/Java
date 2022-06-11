class Overload_method {
    void Test() {
        System.out.println("No Parameters");
    }

    void Test(int a) {
        System.out.println("a: " + a);
    }

    void Test(int a, int b) {
        System.out.println("a and b: " + a + " , " + b);
    }

    double Test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Overload_method om = new Overload_method();
        int a = 10, b = 20;
        om.Test();
        om.Test(a);
        om.Test(a, b);
        double sqr = om.Test(123.4);
        System.out.println("square of double a: " + sqr);
    }
}