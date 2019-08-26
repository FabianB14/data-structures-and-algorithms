package linked_list;

import java.util.ArrayList;

public class Tree {
    TNode root;
    int length;
    public Tree(){
       this.root = null;
    }
    public static ArrayList<Integer> preOrder( ArrayList<Integer> valueList, TNode node){
        if(node == null){
            return valueList;
        }
        valueList.add(node.value);
        preOrder(valueList,node.left);
        preOrder(valueList,node.right);
        return valueList;
    }

    public static  ArrayList <Integer> inOrder(ArrayList<Integer> valueList, TNode node){
        if(node == null){
            return valueList;
        }
        preOrder(valueList, node.left);
        valueList.add(node.value);
        preOrder(valueList, node.right);
        return valueList;
    }
    public static ArrayList <Integer> postOrder(ArrayList<Integer> valueList, TNode node){
        if(node == null){
            return valueList;
        }
        preOrder(valueList, node.left);
        preOrder(valueList,node.right);
        valueList.add(node.value);
        return valueList;
    }

    public TNode addRecursive(TNode current, int value) {
        if (current == null) {
            return new TNode(value);
        }

        if (length % 2 == 0) {
            current.left = addRecursive(current.left, value);
        } else if (length % 2 != 0) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        this.length++;
        return current;
    }
    public boolean contains(int value){
        ArrayList<Integer> valueList = new ArrayList<>();
        this.inOrder(valueList,this.root);


        return valueList.contains(value);
    }
    public String toString(ArrayList<Integer> valueList){
        String newString = "";
        for(int i = 0; i < valueList.size(); i++){
            newString += valueList.get(i) + " ";
        }
        return newString;
    }
}
