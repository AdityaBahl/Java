class Factorial {
    int fact(int n) {
        if (n == 1)
            return 1;
        return fact(n - 1) * n;
    }
}

public class Recursion {
    public static void main(String args[]) {
        Factorial fc = new Factorial();
        System.out.println("Factorial of 4 is: " + fc.fact(3));
        System.out.println("Factorial of 5 is: " + fc.fact(4));
        System.out.println("Factorial of 5 is: " + fc.fact(5));
    }
}