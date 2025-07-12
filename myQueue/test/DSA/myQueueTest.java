package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class myQueueTest {

    @Test
    public void testQueueIsEmpty() {
        myQueue queue = new myQueue(3);
        assertTrue(queue.isEmpty());

    }

    @Test
    public void testQueuesAddThreeItem() {
        myQueue queue = new myQueue(3);
        queue.enqueue(10);
        assertEquals(1, queue.size());

        queue.enqueue(20);
        assertEquals(2, queue.size());

        queue.enqueue(30);
        assertEquals(3, queue.size());

    }

    @Test
    public void testQueueShouldNotAddMoreThanTheSize() {
        myQueue queue = new myQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(3, queue.size());

        queue.enqueue(40);
        assertEquals(3, queue.size());

    }

    @Test
    public void testFrontAndBackOfTheQueue() {
        myQueue queue = new myQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.front());
        assertEquals(30, queue.rear());
    }

    @Test
    public void testToRemoveOneItemFromTheQueue() {
        myQueue queue = new myQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(10, queue.dequeue());

        assertEquals(2, queue.size());
        assertEquals(20, queue.dequeue());
    }

    @Test
    public void testQueueIsFull() {
        myQueue queue = new myQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertTrue(queue.isFull());
    }

    @Test
    public void testQueueIsFull_whenQueueIsEmpty() {
        myQueue queue = new myQueue(3);
        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertTrue(queue.isFull());
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());
        assertEquals(0, queue.size());

    }

    @Test
    public void testRemoveEveryThingFromTheQueue_queueIsEmpty() {
        myQueue queue = new myQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

    }


}
