package linked_list;

public class LinkedList <T> {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(T value){
        Node newNode = new Node(value,this.head );
        this.head = newNode;
    }
    public boolean includes(T value){
        Node node = this.head;
        while(this.head != null && node != null){
            if(node.value == value){
                return true;
            }
            else{
                node = node.next;
            }
        }
        return false;
    }
    public String toString(){
        Node node = this.head;
        String newString = "";
        while (node != null && this.head != null){
           newString += " "+ Integer.toString((Integer) node.value);
            node = node.next;
        }
        return newString;
    }
    public T compare(Node node){
        if(this.head == node){
            return (T) node.value;
        }
        return (T) node;
    }
}

