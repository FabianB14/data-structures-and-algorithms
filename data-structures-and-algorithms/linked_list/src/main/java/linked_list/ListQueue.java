package linked_list;

import java.util.List;

public class ListQueue {
    public List<TNode> list;

    public void enqueue(TNode node){
        this.list.add(node);
    }

    public TNode dequeue(){
        return (TNode) this.list.remove(0);
    }
    public boolean isEmpty(){
        if(this.list.isEmpty()){
            return true;
        }
        return false;
    }
}
