class SomeClass {
    float value;

    void calculate(int a, int b) {
        // method throws exception
        value = (float) a / b;// possibilty of b=0
    }
}

public class MethodException {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        try {
            obj.calculate(200, 0);// throws Exception;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            // prints location and description of excpetion
        }
    }
}
