//create your own exception
class MyException extends Exception {
    private int detail;// instance variable

    MyException(int a)// constructor
    {
        detail = a;// assign value to instance variable
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

// Use it to throw the exception object
class Myclass {
    void compute(int a)// throws MyException
    {
        System.out.println("Called compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal Exit");
    }
}

// steps - 1. create your own exception class
// 2. Use it to throw the exception object
// 3. Catch the thrown Object
public class UserMadeExceptions {
    public static void main(String[] args) {
        try {
            Myclass obj = new Myclass();
            obj.compute(1);
            obj.compute(20);// Value>10 Exception would be thrown
        } catch (MyException e) {
            System.out.println("Caught" + e);
        }
    }
}
