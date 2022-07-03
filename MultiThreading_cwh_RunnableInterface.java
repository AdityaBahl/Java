class MyThread1 implements Runnable {
    public void run(){
        System.out.println("I am a thread 1");
    }
}
class MyThread2 implements Runnable {
    public void run(){
        System.out.println("I am a thread 2");
    }
}
public class MultiThreading_cwh_RunnableInterface {
    public static void main(String args[]) {
        Mythread1 t1= new Mythread1();
        Mythread1 t2= new Mythread2();
       // t1.start(); //cant be run directly while implementing Runnable Interface, as in the case of extending Thread class
       // t2.start(); //cant be run directly while implementing Runnable Interface, as in the case of extending Thread class 
    }
}
