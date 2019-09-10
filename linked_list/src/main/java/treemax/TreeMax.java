package treemax;

import linked_list.TNode;
import linked_list.Tree;

public class TreeMax {

    public static Object treeMax(Tree tree){
        TNode current = tree.root;
        return treeMaxHelper(current,(int)current.value);

    }
    public static int treeMaxHelper(TNode current,int max){

        if(current == null){
            return max;
        }
        if((int)current.value > max){
            max = (int) current.value;
        }
            max = treeMaxHelper(current.left ,max);
            max = treeMaxHelper(current.right, max);

        return max;
    }
}
