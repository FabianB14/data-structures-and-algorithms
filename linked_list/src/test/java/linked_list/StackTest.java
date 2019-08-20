package linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stacked;
    Stack nullStack;
    @Before
    public void setup(){
        stacked  = new Stack();
        for(int i = 10; i > 0; i-- ){
            stacked.push(i);
        }
        nullStack = new Stack();
    }

    @Test
    public void testPush() {
        assertEquals("This should return the value for the last pushed node",1, stacked.peek());
    }

    @Test
    public void testPop() {
        assertEquals("This should be the value of the node popped off",1,stacked.pop());
    }

    @Test
    public void peek() {
        assertEquals("this should return with message about null value","Top is null",nullStack.peek());
    }
}