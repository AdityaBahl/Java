class Testing {
    int a, b;

    Testing(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Testing o) {// Change the values of the variables
        o.a *= 2;// o.a=o.a*2;
        o.b /= 2;// o.a=o.a/2;
    }
}

// Call by
public class CallByRef {
    public static void main(String args[]) {
        Testing ob = new Testing(15, 20);
        System.out.println("ob.a and ob.b before call: ");
        System.out.println(ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: ");
        System.out.println(ob.a + " " + ob.b);
    }
}