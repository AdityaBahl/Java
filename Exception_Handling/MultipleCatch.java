public class MultipleCatch {
    // Each catch catches a different exception
    // Order is :- generic<specialised excpetions
    // example - first ArithmeticExcpetion, then Excpetion
    // if vice versa then compile time error
    // after one catch, others are bypassed
    public static void main(String[] args) {
        try{
            int a=0;// value of a can also be greater than 0
            System.out.println("a= "+a);
            int b=42/a;//Divide by 0
            
        } 
    }
}
