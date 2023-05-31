interface methods {
    public void enqueue();

    public void dequeue();

    public void print();
}

class Queue {

    int queue[] = new int[10];
    int f = -1;
    int r = -1;

    public void enqueue(int data) {
        if (f == -1 && r == -1) {
            f++;
            r++;
        } else {
            r++;
        }
        queue[r] = data;
        System.out.println("\n Inserted " + data + " at " + r);
    }

    public void dequeue() {
        System.out.println("\n "+queue[f] + " dequeued");
        f++;
    }

    public void print() {
        // System.out.println("f = " + f);
        System.out.println("\n Queue Elements are = ");

        for (int i = f; i <= r; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Queue_pgm {
    public static void main(String[] args) {
        Queue nums = new Queue();
        nums.enqueue(10);
        nums.enqueue(20);
        nums.enqueue(30);
        nums.print();
        nums.enqueue(70);
        nums.enqueue(50);
        nums.enqueue(90);
        nums.dequeue();
        nums.print();
    }
}
