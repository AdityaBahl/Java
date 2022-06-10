class Stacks {
    int stack[] = new int[10];
    int tos;

    Stacks() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is Full");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else
            return stack[tos--];
    }
}

public class stack {
    public static void main(String[] args) {
        Stacks mystack = new Stacks();
        for (int i = 0; i < 10; i++) {
            mystack.push(i);
        }
        System.out.println("Data in Stack: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack.pop());
        }
    }
}
