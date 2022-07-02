class RectGen<T>{//single type parameter T
    private T method;
    private T width;
    RectGen(T l, T w){
        length=l;
        width=w;
    }
    T getLength(){
        return length;
    }
    T getWidth(){
        return width;
    }
    T calculateArea(){
        return length*width;
    }
}
public class Rectangle{
    public static void main(String args[]){
        //Rectangle of Integer(Autoboxing and Unboxing)
        RectGen<Integer>obj1=new RectGen<Integer>(10,20);
        
    }
}