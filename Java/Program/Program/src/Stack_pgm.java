interface  methods{
    public void push();
    public void pop();
    public void print();
    public int cal();
}

class Stack {

    int stack[] = new int[10];
    int top = -1;

    public void push(int data) {
        top++;
        stack[top] = data;
        System.out.println("Pushed = " + data + " at " + top);
    }

    public void pop() {
        System.out.println("Popped element is =" + stack[top]);
        top--;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    public int cal(int num){
       return num+5; 
    }

}

public class Stack_pgm {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(10);
        nums.push(20);
        nums.push(40);
        nums.print();
        nums.pop();
        nums.pop();
        nums.print();
        nums.push(60);
        nums.push(70);
        nums.print();
        System.out.println(nums.cal(5));
        int temp= nums.cal(10);
        System.out.println(temp);
    }
}
