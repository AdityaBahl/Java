class A {// Super class
    A() {
        System.out.println("Inside A's Constructor");
    }
}

class B extends A {
    B() {
        System.out.println("Inside B's Constructor");
    }
}

class C extends B {
    C() {
        System.out.println("Inside C's Constructor");
    }
}

// first super class constructor is called then sub class
public class MultiLevel {
    public static void main(String args[]) {
        C obj = new C();// object of class C
    }
}
