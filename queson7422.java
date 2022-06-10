import java.util.Scanner;

public class queson7422 {
    public static void sorting(int a[], int n) {
        for (int i = n - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }

    public static void prime(int a[], int n) {
        // int[] yo = new int[n];
        // int m=0;
        boolean yoo;
        for (int i = 0; i < n; i++) {
            yoo = true;
            for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                if (a[i] % j == 0) {
                    yoo = false;
                    break;
                }
            }
            if (yoo == true)
                System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10, j = 0, k = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int min = a[0], max = a[0], sum = 0;
        int[] odd = new int[n], even = new int[n];
        for (int i = 0; i < n; i++) {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
            sum += a[i];
            if (a[i] % 2 == 0) {
                even[j] = a[i];
                j++;
            } else {
                odd[k] = a[i];
                k++;
            }
        }
        System.out.println("Minimum Value in array: " + min);
        System.out.println("Maximum Value in array: " + max);
        System.out.println("Avg Value in array: " + (sum / n));
        System.out.print("Reverse Order: ");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.print("Even Numbers: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
            // if (a[i + 1] == 0)
            // break;
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
            // if (a[i + 1] == 0)
            // break;
        }
        System.out.println();
        // sorting(a, n);
        prime(a, n);
        sc.close();
    }
}
