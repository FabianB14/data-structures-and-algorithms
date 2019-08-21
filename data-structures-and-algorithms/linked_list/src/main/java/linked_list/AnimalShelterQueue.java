package linked_list;

public class AnimalShelterQueue<T> {
    Animal dogFront;
    Animal dogRear;
    Animal catFront;
    Animal catRear;


    public AnimalShelterQueue(){
        this .dogFront = null;
        this.dogRear = null;
        this.catFront = null;
        this.catRear = null;
    }

    public void enqueue(Animal animal) {
        if (animal.breed == "Dog") {
            if (this.dogFront == null) {
                this.dogRear = animal;
                this.dogFront = animal;
            } else if (this.dogFront != null) {
                animal.next = this.dogRear;
                this.dogRear = animal;
            }
        } else if (animal.breed == "Cat") {
            if (this.catFront == null) {
                this.catRear = animal;
                this.catFront = animal;
            } else if (this.catFront != null) {
                animal.next = this.catRear;
                this.catRear = animal;
            }
        }
    }

    public String dequeue(String breed){
        if(breed == "Dog") {
            Animal current = this.dogRear;
             Animal front = this.dogFront;
            while (current != null) {
                if (current.next == this.dogFront) {
                    this.dogFront = current;
                    this.dogFront.next = null;
                }
                current = current.next;
            }
            return front.name;
        }
        Animal current = this.catRear;
        Animal front = this.catFront;
        while (current != null) {
            if (current.next == this.catFront) {
                this.catFront = current;
                this.catFront.next = null;
            }
            current = current.next;
        }
        return front.name;
    }
    public T peek(String breed){
        if(this.dogFront == null && this.catFront == null){
            return (T) "No animals found";
        }
        if (breed == "Dog") {
            return (T) this.dogFront.name;
        }
        if (breed == "Cat") {
            return (T) this.catFront.name;
        }
        return (T) "Dog not found";
    }

}

