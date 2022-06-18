class Outer {
    int outer_x = 100;

    class Inner// Inner class if declared Private is not available outside
    {
        int data = 20;

        void display() {
            System.out.println("outer_x= " + outer_x);// access outer variable
        }
    }

    void test()// method of outer class
    {
        Inner inner = new Inner();// create object of inner class to access
        inner.display();
        inner.data = 40;// access inner class variable
    }
}

public class NestedClass {
    public static void main(String args[]) {
        // nested class - a class within a class
        // they are useful as helper class or a class that is meaningless outside the
        // class
        // helper classes when created as inner classes can access all the members
        // even the private members
        // eg - if class B is defined within class A then B is known to A but not
        // outside
        // the enclosing class does not have access to the members of the nested class
        // types of nested class -
        // 1.) static - can not access objects from the enclosing class directly, but
        // can through an object
        // 2.) non-static - has direct access to objects of the enclosing class
        // inner class - non static nested class
        Outer obj=new Outer();
        obj.test();
        //create inner object. If not private OK
        Outer.Inner obj=new Outer.new Inner();
        //Inner class has access to all members of the outer class but the reverse is not true
        // An Inner class may be defined within any block scope, eg- a loop can be used as a tool for performing some tasks
        
    }
}
