package linked_list;
//This is the PseudoQueue class that will consist of two stacks
public class PseudoQueue <T>{
    Stack<T> stackOne;
    Stack<T> stackTwo;
    //This is the constructor for the PseudoQueue class
    public PseudoQueue(){
        this.stackOne = new Stack<>();
        this.stackTwo = new Stack<>();
    }
    //This is the enqueue method to push Nodes into the stackOne
    public void enqueue(T value){
        stackOne.push(value);
    }
    //This is the dequeue method it  is designed to pop Nodes off stack to to replicated the queue functionality
    public T dequeue() throws Exception {
        T value;
        if(stackOne.top == null && stackTwo.top == null){
            throw new Exception("PseudoQueue is empty");
        }
        else if(stackTwo.top != null){
            value = stackTwo.pop();
        }
        else{
            while(stackOne.top !=null){
                stackTwo.push(stackOne.pop());
            }
            value = stackTwo.pop();
        }
        return value;
    }
    public T peek() throws Exception {
        if(this.stackTwo.top != null) {
            return (T) this.stackTwo.top.value;
        }
        else if(this.stackTwo.top == null && this.stackOne.top != null){
            while(stackOne.top !=null){
                stackTwo.push(stackOne.pop());
            }
            return (T) this.stackTwo.top.value;
        }
        throw new Exception(("PseudoQueue is null"));
    }
}
