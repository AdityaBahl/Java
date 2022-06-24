//this program demonstrates main thread
//main thread is a thread that begins as soon as a program starts
public class Multi_Threading {
    public static void main(String args[]) {
        // Thread class java.lang Package
        Thread t = Thread.currentThread();// Handle to this thread
        System.out.println("Current thread: " + t);
        // After name change:Thread[My Thread,5,main]
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);// sleep 1000 ms
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
