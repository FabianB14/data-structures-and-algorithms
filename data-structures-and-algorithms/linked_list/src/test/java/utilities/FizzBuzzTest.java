package utilities;

import linked_list.BinarySearchTree;
import linked_list.TNode;
import linked_list.Tree;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    Tree newTree;
    ArrayList<Object> valueList = new ArrayList<>();

    @Before
    public void setUp(){
        TNode root = new TNode(15);
        newTree = new Tree(root);
        for(int i = 0; i < 30; i++){
            newTree.addRecursiveTree(newTree.root,i);
        }
    }
    @Test
    public void testFizzBuzz() {

        FizzBuzz.fizzBuzz(newTree);
        newTree.inOrder(valueList,newTree.root);
        assertEquals("this should return fizzbuzz, fizz and buzz in the correct order","fizzbuzz 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 ",
                newTree.toString(valueList));
    }
}