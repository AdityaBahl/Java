public class Multi_Threading2 {
    public static void main(String[] args) {
        // create multiple threads
        NewThread t1 = new NewThread("One");// Thread "One"
        NewThread t2 = new NewThread("Two");// Thread "Two"
        NewThread t3 = new NewThread("Three");// Thread "three"
        try {
            Thread.sleep(10000);// sleep for 10000ms or 10 secs
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
// there are 2 methods to check when another thread has ended:
// 1. find boolean isAlive()
// 2. find void join()