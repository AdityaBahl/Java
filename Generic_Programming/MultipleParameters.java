class GenMulti<T, V, W> {
    T d1;// Object reference
    V d2;
    W d3;

    GenMulti(T v1, V v2, W v3) {
        d1 = v1;
        d2 = v2;
        d3 = v3;
    }

    // display type of objects
    void displayType() {
        System.out.println("This type of d1 is: " + d1.getClass().getName());
        System.out.println("This type of d2 is: " + d2.getClass().getName());
        System.out.println("This type of d3 is: " + d3.getClass().getName());
    }

    // display objects
    void displayContent() {
        System.out.println("Content of d1 is: " + d1);
        System.out.println("Content of d2 is: " + d2);
        System.out.println("Content of d3 is: " + d3);
    }
}// end of class

public class MultipleParameters {

}
