package reimplequeue;

import static reimplequeue.Queue.deQueue;
import static reimplequeue.Queue.enQueue;

public class MainQueue {


    public static void main(String[] args) {
        // Create a queue and initialize front and rear
        Queue  q = new Queue();
        q.front = q.rear =  null;

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Display elements present in Circular Queue
        q.displayQueue();

        // Deleting elements from Circular Queue
        System.out.printf(" Deleted value = %d", deQueue(q));
        System.out.printf(" Deleted value = %d", deQueue(q));

        // Remaining elements in Circular Queue
        q.displayQueue();

        enQueue(q, 9);
        enQueue(q, 20);
        q.displayQueue();

    }

}
