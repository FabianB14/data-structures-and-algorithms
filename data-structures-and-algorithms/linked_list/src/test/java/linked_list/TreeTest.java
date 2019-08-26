package linked_list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    BinarySearchTree newTree;
    BinarySearchTree newTree2;
    ArrayList<Integer> valueList = new ArrayList<>();
    @Before
    public void setUp(){
        Tree newTreeNull = new BinarySearchTree();
        TNode root2 = new TNode(2);
        newTree2 = new BinarySearchTree(root2);
        newTree2.addRecursive(newTree2.root,1);
        newTree2.addRecursive(newTree2.root,3);
        TNode root = new TNode(5);
        newTree = new BinarySearchTree(root);
        newTree.addRecursive(newTree.root,6);
        newTree.addRecursive(newTree.root,7);
        newTree.addRecursive(newTree.root,8);
        newTree.addRecursive(newTree.root,9);
        newTree.addRecursive(newTree.root,10);
        newTree.addRecursive(newTree.root,1);
        newTree.addRecursive(newTree.root,2);
        newTree.addRecursive(newTree.root,3);
        newTree.addRecursive(newTree.root,4);

    }

    @Test
    public void preOrder() {
        newTree.preOrder(valueList,newTree.root);
        assertEquals("this should be the preOrder list","5 1 2 3 4 6 7 8 9 10 ", newTree.toString(valueList));
    }

    @Test
    public void inOrder() {
        newTree.inOrder(valueList,newTree.root);
        assertEquals("this should be the preOrder list","1 2 3 4 5 6 7 8 9 10 ", newTree.toString(valueList));
    }

    @Test
    public void postOrder() {
        newTree.postOrder(valueList,newTree.root);
        assertEquals("this should be the preOrder list","1 2 3 4 6 7 8 9 10 5 ", newTree.toString(valueList));
    }

    @Test
    public void contains() {
        System.out.println(newTree2.root.value);
        System.out.println(newTree2.root.left.value);
        System.out.println(newTree2.root.right.value);
        assertTrue("this should be true", newTree.contains(8));
        assertFalse("this should be false",newTree.contains(24));
    }
}