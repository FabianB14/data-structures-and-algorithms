package linked_list;

import java.util.ArrayList;

public class BinarySearchTree extends Tree{
    TNode root;
    int length;

    public BinarySearchTree(){
        this.root = null;
    }
    public BinarySearchTree(TNode root){
        this.root = root;
    }
    public TNode addRecursive(TNode current, int value) {
        if (current == null) {
            return new TNode(value);
        }

        if ((int)current.value > value) {
            current.left = addRecursive(current.left, value);
        } else if ((int)current.value < value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }
    public boolean contains(int value){
        ArrayList<Object> valueList = new ArrayList<>();
        this.inOrder(valueList,this.root);


        return valueList.contains(value);
    }
}
