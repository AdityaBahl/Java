//quick sort is a divide and conquer algorithm using pivot breaks array into 2
class Qsort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);// index of smaller element
        for (int j = low; j < high; j++) {
            // if current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high](or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }// end of partition

    void quicksort(int a[], int beg, int end) {
        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            quicksort(a, beg, end);
            quicksort(a, loc + 1, end);
        }
    }
}// end of class Qsort

class Cthread implements Runnable {
    Thread t;// create ref of thread class java.lang Package
    int arr[], low, hi;

    Cthread(int a[], int l, int h, String name)// Constructor
    {
        t = new Thread(this, name);// Thread class
        arr = a;
        low = l;
        hi = h;
        t.start();// calls run method
    }

    public void run()// Run method is called by start()
    {
        try {
            Qsort obj = new Qsort();
            obj.quicksort(arr, low, hi);
        } catch (Exception e) {
            System.out.println("Child interrupted. " + e);
        }
        System.out.println("Exiting child thread");
    }// run
}// class Cthread

public class QuickSortUsingMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // part of data to child 1
        int arr1[] = { 90, 32, 101, 245, 865, 31, 1067, 89, 34, 23 };
        Cthread c1 = new Cthread(arr1, 0, 9, "First");
        // other part to child 2
        int arr2[] = { 10, 15, 1021, 45, 65, 100, 67, 589, 134, 68 };
        Cthread c2 = new Cthread(arr2, 0, 9, "Second");
        // wait for child to sort
        try {
            c1.t.join();
            c2.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception: " + ex);
        }
        // merging results of two threads
        int i1 = arr1.length - 1, j1 = arr2.length - 1, k = arr1.length + arr2.length;
        int combArray[] = new int[k];
        while (k > 0) {
            combArray[--k] = (j1 < 0 || (i1 >= 0 && arr1[i1] >= arr2[j1])) ? arr1[i1--] : arr2[j1--];
        }
        for (int i = 0; i < combArray.length; i++) {
            System.out.println(combArray[i] + ",");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (stopTime - startTime));
    }// end of main
}// end of class
