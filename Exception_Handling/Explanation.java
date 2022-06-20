import java.util.*;//reads integer from user
//try - a block surrounding problem statement to monitor for exceptions
//catch - together with try, catches specific kinds of exceptions and handles them in some way
//finally - specifies any code that absolutely must be executed whether or not an exception occurs
//throw - used to throw a specific exception from the program
//throws - specifies which exception a given method can throw

public class Explanation {
    public static void main(String args[]) {
        System.out.println("Enter an Integer");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();// iF user enters invalid format?
            System.out.println("Thank you for entering the data");
        } catch (Exception e)// catch the error object
        {
            System.out.println("Error in input: " + e);
        }
        System.out.println("After try/catch blocks");
    }
}
// all exceptions in java are subclasses of the build in class "Throwable"
// Throwable contains two immediate sub classes:

// 1. Exception - should be catched, there are 2 types
// 1.a. Checked Exceptions - compile time Exception, must be handled using try
// and catch block
// 1.b. Unchecked Exceptions- Runtime Exception, not forced to handle but its a
// good practice to handle

// 2. Error - they are outside control usually, user programs are not required
// to catch them