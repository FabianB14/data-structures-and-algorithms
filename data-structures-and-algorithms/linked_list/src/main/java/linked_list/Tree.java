package linked_list;

import java.util.ArrayList;

public class Tree {
    TNode root;
    int length;

    public Tree(){
       this.root = null;
    }
    public Tree(TNode root){
        this.root = root;
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

    public String toString(ArrayList<Integer> valueList){
        String newString = "";
        for(int i = 0; i < valueList.size(); i++){
            newString += valueList.get(i) + " ";
        }
        return newString;
    }
}
