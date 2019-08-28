package breadth;

import linked_list.Node;
import linked_list.TNode;
import linked_list.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    Tree tree;
    @Before
    public void setUp(){
        TNode tNode = new TNode(10);
        tree = new Tree(tNode);

        TNode tNodeTwo =  new TNode(20);
        tNode.left = tNodeTwo;

        TNode tNodeThree =  new TNode(25);
        tNodeTwo.left = tNodeThree;

        TNode tNodeFour =  new TNode(30);
        tNode.right = tNodeFour;

        TNode tNodeFive =  new TNode(35);
        tNodeTwo.right = tNodeFive;

        TNode tNodeSix =  new TNode(40);
        tNodeFour.right = tNodeTwo;

        //                       10
        //                     /    \
        //                    20      30
        //                   /   \       \
        //                  25     35     40

    }
    @Test
    public void testBreadthFirst() {
        assertEquals("this array should bethe same as the one comes out","10 , 20 ,30 ", BreadthFirst.breadthFirst(tree).toString());
    }
}