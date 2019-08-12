package linked_list;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insert() {
        LinkedList linked  = new LinkedList();
        linked.insert(10);
        assertEquals("this should insert a new head for the linked list",10, linked.compare(linked.head));
    }

    @Test
    public void includes() {
        LinkedList linked  = new LinkedList();
        for(int i = 10; i > 0; i-- ){
            linked.insert(i);
        }
        assertTrue("this should return true", linked.includes(5));
        assertFalse("this should return false",linked.includes(11));
    }

    @Test
    public void testToString() {
        LinkedList linked  = new LinkedList();
        for(int i = 1; i <= 10; i++ ){
            linked.insert(i);
        }
        assertEquals("this should return a string equal to all the values of the linked list", " 10 9 8 7 6 5 4 3 2 1", linked.toString());
    }
}