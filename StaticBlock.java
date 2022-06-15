class UseStatic// accessing in same class
{
    static int b, a;// a=3 Can be initialised here
    int nonstatic = 10;// instance variable

    static void calExpression(int x)// static method
    {
        // non static=30; compiler error cannot access instance var
        System.out.print("x= " + x + " a= " + a);
        System.out.println(" b= " + b);
        System.out.println(b * b + a);// c=b*b+c
    }

    static // used for intialising static variables of class
    {
        System.out.println("Static Block intialised.");
        a = 3;
        b = a * 4;
    }
}

public class StaticBlock {
    public static void main(String args[]) {
        UseStatic.calExpression(42);// use class name
    }
}
