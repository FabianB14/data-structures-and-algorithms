package linked_list;

public class TNode {
    public Object value;
    public TNode left;
    public TNode right;


    public TNode(Object value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public TNode(Object value, TNode left, TNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

}

