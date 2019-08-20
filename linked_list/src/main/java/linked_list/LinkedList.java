package linked_list;

public class LinkedList <T> {
    Node head;
    int length;

    public LinkedList(){
        this.head = null;
        this.length = 0;
    }

    public void insert(T value){
        Node newNode = new Node(value,this.head );
        this.head = newNode;
        this.length++;
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
           newString +=  node.value + " ";
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
    public void append(T value){
        Node current = this.head;
        Node newNode = new Node(value,null);
        if(this.head == null){
            this.head = newNode;
        }else {
            while (current != null) {
                if (current.next == null) {
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        this.length++;
    }

    public void insertBefore(T value, T newValue){
        Node current = this.head;
        Node newNode = new Node(newValue,null);
        if(this.head.value == value){
            newNode.next = this.head;
            this.head = newNode;
        }
        else {
            while (current != null && current.next != null) {
                if (current.next.value == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        this.length++;

    }
    public void insertAfter(T value, T newValue){
        Node current = this.head;
        Node newNode = new Node(newValue,null);
        if(this.head.value == value){
            this.head.next = newNode;
        }
        else {
            while (current != null && current.next != null) {
                if (current.value == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        this.length++;
    }

    public boolean compareAppend(T value){
        Node current = this.head;
        while(current != null && current.next != null){
            if(current.next.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean compareInsertBefore(T value, T newValue){
        Node current = this.head;
        while(current != null && current.next != null){
            if(current.next.next.value == value && current.next.value == newValue){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean compareInsertAfter(T value, T newValue){
        Node current = this.head;
        while(current.next != null){
            if(current.next.next.value == newValue && current.next.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int fromKth(int  kth){
        Node current = this.head;
        Node kthCurrent = this.head;
        int count = 0;
        if(this.head == null){
            return Integer.parseInt("Exception");
        }
        while(current != null){
            if(count >= kth){
                current = current.next;
            }
            kthCurrent = kthCurrent.next;
            if(kthCurrent == null){
                return (int)current.value;
            }
            count++;

        }
        return Integer.parseInt("Exception");
    }

    public static LinkedList linkedListMerge(LinkedList linkedListOne, LinkedList linkedListTwo){
            Node currentOne = linkedListOne.head;
            Node currentTwo = linkedListTwo.head;
            Node pointerOne = linkedListOne.head.next;
            Node pointerTwo = linkedListTwo.head.next;
        if(currentOne == null){
            return linkedListTwo;
        }
        if(currentTwo == null){
            return linkedListOne;
        }
        while (pointerOne != null || pointerTwo != null){
            currentTwo.next = currentOne.next;
            currentOne.next = currentTwo;
            currentTwo = pointerTwo;
            currentOne = pointerOne;
            pointerOne = pointerOne.next;
            pointerTwo = pointerTwo.next;
        }
        System.out.println(linkedListOne.length);
        return linkedListOne;
    }
}

