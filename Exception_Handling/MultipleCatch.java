public class MultipleCatch {
    // Each catch catches a different exception
    // Order is :- generic<specialised excpetions
    // example - first ArithmeticExcpetion, then Excpetion
    // if vice versa then compile time error
    // after one catch, others are bypassed
    public static void main(String[] args) {
        try {
            int a = 0;// value of a can also be greater than 0
            System.out.println("a= " + a);
            int b = 42 / a;// Divide by 0
            int c[] = new int[5];
            c[8] = 99;// Array index out of bound
        } catch (ArithmeticException e)// Inherited from java.lang.RuntimeException
        {
            System.out.println("Divide by 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e)// RunExp->IndexOB->AIOB
        {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
    }
}
