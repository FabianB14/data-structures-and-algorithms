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
        assertEquals("this should return a string equal to all the values of the linked list", "10 9 8 7 6 5 4 3 2 1 ", linked.toString());
    }

    @Test
    public void testAppend() {
        LinkedList linked  = new LinkedList();
        for(int i = 1; i <= 10; i++ ){
            linked.insert(i);
        }
        linked.append(11);
        assertTrue("this should be true", linked.compareAppend(11));
        assertFalse("this should be true", linked.compareAppend(12));
    }

    @Test
    public void insertBefore() {
        LinkedList linked  = new LinkedList();
        for(int i = 1; i <= 10; i++ ){
            linked.insert(i);
        }
        linked.insertBefore(5,30);
        assertTrue("this should be true", linked.compareInsertBefore(5,30));

    }

    @Test
    public void insertAfter() {
        LinkedList linked  = new LinkedList();
        for(int i = 1; i <= 10; i++ ){
            linked.insert(i);
        }
        linked.insertBefore(5,30);
        assertTrue("this should be true", linked.compareInsertBefore(5,30));
    }

    @Test
    public void linkedListMerge() {
        LinkedList linked  = new LinkedList();
        LinkedList linked2 = new LinkedList();
        for(int i = 0; i <= 10; i++ ) {
            linked.insert(i);
            linked2.insert(i + 10);
        }
            LinkedList mergedList =  LinkedList.linkedListMerge(linked,linked2);
            assertEquals("this should equal the correct merge output","10 20 9 19 8 18 7 17 6 16 5 15 4 14 3 13 2 12 1 11 0 ", mergedList.toString());

    }

    @Test
    public void fromKth() {
        LinkedList linked  = new LinkedList();
        for(int i = 0; i <= 10; i++ ){
            linked.insert(i);
        }
        assertEquals("this should return the value of the kth index from the back", 3, linked.fromKth(4));
    }
}