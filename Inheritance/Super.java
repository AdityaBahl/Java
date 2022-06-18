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
        super();            //Invokes Box(); must be first statement
        width=20;
    }
    RectBox{
        super(obj);         //Passing RectBox to Box
        width=obj.width;
    }
    void display(){
        System.out.println(super.size+" "+ width);
        //OR
        super.display();    //display of box
        System.out.println(" " + width);
    }
}

public class Super {
    public static void main(String args[]) {
        RectBox rObj1 = new RectBox();
        RectBox rObj2 = new RectBox(rObj1);// parameterized
    }
}
