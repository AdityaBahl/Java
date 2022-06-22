//create your own exception
class MyException extends Exception {
    private int detail;// instance variable

    MyException(int a)// constructor
    {
        detail = a;// assign value to instance variable
    }

    public String toString(){
        return "MyException[" +detail+ "]"
    }
}
// Use it to throw the exception object

// steps - 1. create your own exception class
// 2. Use it to throw the exception object
// 3. Catch the thrown Object
public class UserMadeExceptions {
    public static void main(String[] args) {

    }
}
