package linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterQueueTest {
    AnimalShelterQueue animalsQueued;
    AnimalShelterQueue nullQueue;
    AnimalShelterQueue newTestQueue;
    @Before
    public void setup(){
        animalsQueued  = new AnimalShelterQueue();
        for(int i = 10; i > 0; i-- ){
            Dog  newAnimal = new Dog("Kujo"+i);
            animalsQueued.enqueue(newAnimal);
        }
        newTestQueue = new AnimalShelterQueue();
        Dog newKujo = new Dog("Deadly");
        newTestQueue.enqueue(newKujo);
        System.out.println(newKujo.breed);
        nullQueue = new AnimalShelterQueue();

        for(int i = 10; i > 0; i-- ){
            Cat  newAnimal = new Cat("Neko"+i);
            animalsQueued.enqueue(newAnimal);
        }
        Cat newNeko = new Cat("Fluffy");
        newTestQueue.enqueue(newNeko);
        System.out.println(newNeko.breed);
        nullQueue = new AnimalShelterQueue();
    }
    @Test
    public void enqueue() {
        assertEquals("This should be the value of the first Node entered in the Queue", "Kujo10", animalsQueued.peek("Dog"));
        assertEquals("This should be the value of the first Node entered in the Queue", "Neko10", animalsQueued.peek("Cat"));
        assertEquals("this should still be the value of the first entered node","Deadly",newTestQueue.peek("Dog"));
        assertEquals("this should still be the value of the first entered node","Fluffy",newTestQueue.peek("Cat"));
    }

    @Test
    public void dequeue() {
        assertEquals("this should return the value of the first dog entered", "Kujo10", animalsQueued.dequeue("Dog"));
        assertEquals("this should return the value of the first cat entered", "Neko10", animalsQueued.dequeue("Cat"));
        assertEquals("this should return the value of the second dog entered after the first node was removed", "Kujo9", animalsQueued.dequeue("Dog"));
        assertEquals("this should return the value of the second cat entered after the first node was removed", "Neko9", animalsQueued.dequeue("Cat"));

    }
}