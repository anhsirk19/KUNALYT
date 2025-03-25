package StacksNqueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue q = new CustomQueue(5);
        // q.insert(1);
        // q.insert(3);
        // q.insert(5);
        // q.insert(7);
        // q.insert(9);
        // q.display();
        // System.out.println(q.remove());
        // q.display();

        CircularQueue q = new CircularQueue(5);
        q.insert(1);
        q.insert(3);
        q.insert(5);
        q.insert(7);
        q.insert(9);

        q.display();

        System.out.println(q.remove());

        q.insert(99);

        q.display();
    }
}
