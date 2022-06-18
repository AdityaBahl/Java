//Final Keyword has 3 uses:
//1.declare a value whose value cant be changed after initialisation
//2.declare a method which can not be overridden
//3.declare a class which can not have any subclass
class A {
    final void meth() {// Final method
        System.out.println("This is a final method.");
    }
}

class B extends A {
    // void meth() {// declaration is illegal,compiler error
    // System.out.println("Illegal!");
    // }

    void metho() {
        System.out.println("legal!");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth();
        // b.meth(); // (illegal)
        b.metho();// legal
    }
}
