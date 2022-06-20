import java.util.*;//reads integer from user

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