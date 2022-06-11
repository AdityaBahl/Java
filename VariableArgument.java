class Box {
    void argDemo(int... ary) {
        System.out.println("No of args " + ary.length);
        // ary is an array
        // for(int i:ary){} can also be used alternati
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println();
    }
}

public class VariableArgument {
    public static void main(String args[]) {
        Box mybox = new Box();
        mybox.argDemo(20, 30, 40);// Length=3
        mybox.argDemo(10, 55);// Length=2
        mybox.argDemo();// Length=0, its also ok
    }
}
