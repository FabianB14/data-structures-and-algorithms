package linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue queued;
    Queue nullQueue;
    Queue newTestQueue;
    @Before
    public void setup(){
         queued  = new Queue();
        for(int i = 10; i > 0; i-- ){
            queued.enqueue(i);
        }
        newTestQueue = new Queue();
        newTestQueue.enqueue(24);
         nullQueue = new Queue();
    }
    @Test
    public void enqueue() {
        assertEquals("This should be the value of the first Node entered in the Queue", 10, queued.peek());
        assertEquals("this should still be the value of the first entered node",24,newTestQueue.peek());
    }

    @Test
    public void dequeue() {
        assertEquals("this should return the value of the first node entered", 10, queued.dequeue());
        assertEquals("this should return the value of the second node entered after the first node was removed", 9, queued.dequeue());
    }

    @Test
    public void peek() {
        assertEquals("this should be the return a message for being null","Front is null",nullQueue.peek());
    }
}