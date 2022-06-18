abstract class A {
    abstract void callme();// abstract method

    void callmetoo() {
        System.out.println("concrete method.");
    }
}

class B extends A {// Concrete class
    void callme() {// Implements method
        System.out.println("B's implementation of callme() function");
    }
}

public class MethodOverridingAndAbstract {
    public static void main(String args[]) {
        A a = new B();// Reference of Abstract super to object of B
        a.callme();
        a.callmetoo();
    }
}
