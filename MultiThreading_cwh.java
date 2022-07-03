// observe that both operations run concurrently and randomly and not subsequently
// class Mythread1 extends Thread

////////////////////////////////

//Made By Extending Thread Class

////////////////////////////////

class Mythread1 extends Thread {
    // @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1 is good");
            System.out.println("I'm happy");
        }
    }
}

class Mythread2 extends Thread {
    // @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2 is good");
            System.out.println("I'm sad");
        }
    }
}

public class MultiThreading_cwh {
    public static void main(String args[]) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}