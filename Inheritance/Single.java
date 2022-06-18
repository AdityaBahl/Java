class A {
    int i;// Variable of class A

    void showi() {
        System.out.println("i: " + i);
    }
}

class B extends A {
    int j;// Variable of class B

    void showj() {
        System.out.println("j: " + j);
    }

    void sum() {
        System.out.println("i+j: " + (i + j));// accessing i and j
    }
}

public class Single {
    public static void main(String args[]) {
        A superObj = new A();
        B subObj = new B();
        superObj.i = 10;// initialize class A's Variable
        System.out.println("Contents of a: ");
        superObj.showi();
        subObj.i = 7;
        subObj.j = 8;
        System.out.println("Contents of b: ");
        subObj.showi();
        subObj.showj();
        System.out.println("Sum of i and j in b: ");
        subObj.sum();
    }
}
