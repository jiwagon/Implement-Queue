import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QueueTest {

    @Test
    public void testEnQueue() {
        Queue queue = new Queue();

        // Both head and tail of a queue should be 11 since there is only one element in the queue.
        queue.enQueue(11);
        assertEquals(11, queue.head.data);
        assertEquals(11, queue.tail.data);

        // Added another element making 2 total elements in the queue,
        // so head element should be 11, and tail should be 22.
        queue.enQueue(22);
        assertEquals(11, queue.head.data);
        assertEquals(22, queue.tail.data);
        System.out.println("The queue size is " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        // Set up a 5 elements queue.
        Queue queue1 = new Queue();
        queue1.enQueue(5);
        queue1.enQueue(20);
        queue1.enQueue(1000);
        queue1.enQueue(88);
        queue1.enQueue(739);
        assertEquals(5, queue1.head.data);
        assertEquals(739, queue1.tail.data);
        System.out.println("The queue size is " + queue1.getQueueSize() + " nodes.");
        System.out.println(queue1.toString());
    }

    @Test
    public void testDeQueue() {
        Queue queue = new Queue();

        // Set up a 5 elements queue.
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        assertEquals(1, queue.head.data);
        assertEquals(5, queue.tail.data);
        System.out.println("The queue size is " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        // Test method 1
        assertEquals(1, queue.deQueue().data);
        assertEquals(2, queue.head.data);
        assertEquals(5, queue.tail.data);
        System.out.println("The queue size is reduced to " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        // Test method 2
        queue.deQueue();
        queue.deQueue();
        assertEquals(4, queue.head.data);
        assertEquals(5, queue.tail.data);
        System.out.println("The queue size is reduced to " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        // Queue becomes NULL.
        queue.deQueue();
        queue.deQueue();
        assertEquals("NULL", "NULL");
        System.out.println("The queue size is reduced to " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());
    }

    @Test
    public void testEnQueueAndDeQueue() {
        Queue queue = new Queue();

        // Set up a 5 elements queue.
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        assertEquals(1, queue.head.data);
        assertEquals(5, queue.tail.data);
        System.out.println("The queue size is " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        // Queue size remains the same, remove one element at front, add one element at rear.
        assertEquals(1, queue.deQueue().data);
        queue.enQueue(6);
        assertEquals(2, queue.head.data);
        assertEquals(6, queue.tail.data);
        System.out.println("The queue size is still " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        // Remove one element reducing the queue size
        queue.deQueue();
        assertEquals(3, queue.head.data);
        assertEquals(6, queue.tail.data);
        System.out.println("The queue size is reduced to " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());

        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        assertEquals(3, queue.head.data);
        assertEquals(9, queue.tail.data);
        System.out.println("The queue size is added to " + queue.getQueueSize() + " nodes.");
        System.out.println(queue.toString());
    }
}