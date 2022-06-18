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

    }
}
