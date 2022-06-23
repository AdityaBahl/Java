//interfaces basically are like classes but only having abstract variables and methods
//an interface can extend another interface
interface Callback// Interface default access
{
    void display(int param);// public and abstract method
}

class Client implements Callback {
    public void display(int p)// should be public
    {
        System.out.println("Callback called with " + p);
    }
}

public class Interfaces {
    public static void main(String args[]) {
        Client c = new Client();
        int a = 10;
        c.display(a);
    }
}
