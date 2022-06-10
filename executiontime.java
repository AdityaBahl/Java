public class executiontime {

    public static void main(String[] args) {
        long startTime = System.nanoTime();// nano seconds
        long endTime = System.nanoTime();
        // int a = 10;
        // for (int i = 0; i < 10; i++)
        // a++;
        long totalTime = endTime - startTime;
        System.out.println(totalTime / 1e9);// in seconds
    }
}