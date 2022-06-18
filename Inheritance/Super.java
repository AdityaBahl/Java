class Box {
    int size;

    Box() {
        size = 10;
    }

    Box(Box obj) {
        size = obj.size();
    }

    void display() {
        System.out.println(size);
    }
}

class RectBox extends Box{
    int width;
    RectBox{
        super();
        width=20;
    }
    RectBox{
        super(obj);
        width=obj.width;
    }
    
}

public class Super {
    public static void main(String args[]) {

    }
}
