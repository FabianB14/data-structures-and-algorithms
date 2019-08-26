package linked_list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    Tree newTree;
    ArrayList<Integer> valueList;
    @Before
    public void setUp(){
        newTree = new Tree();
        TNode root = new TNode(0);
        newTree.root = root;
        for(int i = 1; i < 10; i++){
            newTree.addRecursive(newTree.root,i);
        }
        valueList = new ArrayList<>();
    }

    @Test
    public void preOrder() {
        newTree.preOrder(valueList,newTree.root);
        assertEquals("this should be the preOrder list","0 1 3 4 7 8 2 5 6 9 ", newTree.toString(valueList));
    }

    @Test
    public void inOrder() {
        newTree.inOrder(valueList,newTree.root);
        assertEquals("this should be the preOrder list","1 3 4 7 8 0 2 5 6 9 ", newTree.toString(valueList));
    }

    @Test
    public void postOrder() {
        newTree.postOrder(valueList,newTree.root);
        assertEquals("this should be the preOrder list","1 3 4 7 8 2 5 6 9 0 ", newTree.toString(valueList));
    }

    @Test
    public void contains() {
        assertTrue("this should be true", newTree.contains(8));
        assertFalse("this should be false",newTree.contains(24));
    }
}