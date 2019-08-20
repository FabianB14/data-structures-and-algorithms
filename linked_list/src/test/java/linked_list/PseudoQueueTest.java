package linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue queued;
    PseudoQueue nullQueue;
    PseudoQueue newTestQueue;
    @Before
    public void setup(){
        queued  = new PseudoQueue();
        for(int i = 10; i > 0; i-- ){
            queued.enqueue(i);
        }
        newTestQueue = new PseudoQueue();
        newTestQueue.enqueue(24);
        nullQueue = new PseudoQueue();
    }
    @Test
    public void enqueue() throws Exception {
        assertEquals("This should be the value of the first Node entered in the Queue", 10, queued.peek());
        assertEquals("this should still be the value of the first entered node",24,newTestQueue.peek());
    }

    @Test
    public void dequeue() throws Exception {
        assertEquals("this should return the value of the first node entered", 10, queued.dequeue());
        assertEquals("this should return the value of the second node entered after the first node was removed", 9, queued.dequeue());
    }
}