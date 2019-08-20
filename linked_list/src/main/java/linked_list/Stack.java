package linked_list;

public class Stack <T> extends LinkedList {
    Node top;

    public Stack(){
        this.top = null;
    }

    public void push(T value){
        Node newNode = new Node(value,this.top);
        this.top = newNode;
    }
    public T pop(){
        T value = (T) this.top.value;
        this.top = this.top.next;
        return value;
    }
    public T peek(){
        if(this.top == null || this.top.value == null){
            return (T) "Top is null";
        }
        return (T) this.top.value;
    }
}
