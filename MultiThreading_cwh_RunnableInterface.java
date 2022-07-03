class Mythread3 implements Runnable {
    public void run(){
        System.out.println("I am a thread 1");
    }
}
class Mythread4 implements Runnable {
    public void run(){
        System.out.println("I am a thread 2");
    }
}
public class MultiThreading_cwh_RunnableInterface {
    public static void main(String args[]) {
        Mythread3 bullet1= new Mythread3();//bullet in gun analogy
        Thread gun1=new Thread(bullet1);        
        Mythread4 bullet2= new Mythread4();
        Thread gun2=new Thread(bullet2);
        gun1.start(); //cant be run directly while implementing Runnable Interface without Thread gun type statements, as in the case of extending Thread class
        gun2.start(); //cant be run directly while implementing Runnable Interface without Thread gun type statements, as in the case of extending Thread class 
    
      }
}
