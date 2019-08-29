package linked_list.breadth;

import linked_list.Queue;
import linked_list.TNode;
import linked_list.Tree;

import java.util.ArrayList;

public class BreadthFirst {
    public static ArrayList <Object> breadthFirst(Tree tree){
        ArrayList<Object> treeArrayList = new ArrayList<>();
        Queue treeQueue = new Queue();
        if(tree.root == null){
            return treeArrayList;
        }
        treeQueue.enqueue(tree.root);
        while(!treeQueue.isEmpty()){
            TNode node = (TNode) treeQueue.dequeue();
            System.out.print(node.value + " ");
            treeArrayList.add(node.value);
            if(node.left != null) treeQueue.enqueue(node.left);
            if(node.right != null) treeQueue.enqueue(node.right);
        }
        return treeArrayList;
    }
}
