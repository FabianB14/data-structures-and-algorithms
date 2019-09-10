package linked_list;

public class Queue <T> extends LinkedList{
    Node front;
    Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }


    public void enqueue(Object value){
        Node newNode = new Node(value,null);
        if(this.front == null){
            this.front = newNode;
            this.rear = newNode;
        }
        else if(this.front != null){
            newNode.next = this.rear;
            this.rear = newNode;
        }
    }

    public Object dequeue(){
        Node current = this.rear;
        Object value =  front.value;
        while(current != null){
            if(current.next == this.front){
                this.front = current;
                this.front.next = null;
            }
            else if(this.front == this.rear){
                current = this.front;
                this.front = null;
                this.rear = null;
            }
            current = current.next;
        }
        return value;
    }



    public T peek(){
        if(this.front == null || this.front.value == null){
            return (T) "Front is null";
        }
        return (T) this.front.value;
    }
    public boolean isEmpty(){
        if(this.front == null){
            return true;
        }
        return false;
    }

}
