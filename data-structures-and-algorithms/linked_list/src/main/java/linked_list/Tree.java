package linked_list;

import java.util.ArrayList;

public class Tree {

    public TNode root;
    int length;

    public Tree(){
       this.root = null;
    }
    public Tree(TNode root){
        this.root = root;
    }
    public static ArrayList<Object> preOrder(ArrayList<Object> valueList, TNode node){
        if(node == null){
            return valueList;
        }
        valueList.add(node.value);
        preOrder(valueList,node.left);
        preOrder(valueList,node.right);
        return valueList;
    }

    public static  ArrayList <Object> inOrder(ArrayList<Object> valueList, TNode node){
        if(node == null){
            return valueList;
        }
        preOrder(valueList, node.left);
        valueList.add(node.value);
        preOrder(valueList, node.right);
        return valueList;
    }
    public static ArrayList <Object> postOrder(ArrayList<Object> valueList, TNode node){
        if(node == null){
            return valueList;
        }
        preOrder(valueList, node.left);
        preOrder(valueList,node.right);
        valueList.add((int)node.value);
        return valueList;
    }

    public String toString(ArrayList<Object> valueList){
        String newString = "";
        for(int i = 0; i < valueList.size(); i++){
            newString += valueList.get(i) + " ";
        }
        return newString;
    }
    public TNode addRecursiveTree(TNode current, int value) {
        if (current == null) {
            return new TNode(value);
        }

        if ((int)current.value > value) {
            current.left = addRecursiveTree(current.left, value);
        } else if ((int)current.value < value) {
            current.right = addRecursiveTree(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }
}
