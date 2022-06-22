//finally os executed irrespective of whether exception has occured or not
//It can not be present without catch, i.e.
//try->catch->finally or try->finally
public class Finally {
    public static void main(String[] args) {
        System.out.println("Encountering Exception");
        try {
            int arr[] = new int[10];
            int i = 12;
            System.out.println(arr[i]);// Results in Error here
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();// Use of method associated with "e"
        } finally {// Must be either after Catch OR try(if catch is not present)
            System.out.println("finally");
        }
        System.out.println("after finally\n");
        System.out.println("When no Exception Encountered");
        try {
            int arr[] = new int[10];
            int i = 12;
            System.out.println(arr[i]);// ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {// Not Encountered
            e.printStackTrace();// Use of method associated with "e"
        } finally {// Must be either after Catch OR try(if catch is not present)
            System.out.println("finally");
        }
        System.out.println("after finally");
    }
}
