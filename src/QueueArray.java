import java.util.ArrayList;

public class QueueArray<T> {
    private ArrayList<T> arr = new ArrayList<T>();

    public T enqueue(T item){
        arr.add(item);
        return item;
    }

    public T dequeue(){
        T returner = arr.get(0);
        arr.remove(0);
        return returner;
    }

    public T peek(){
        T returner = arr.get(0);
        return returner;
    }

    public void display(){
        for(int i = 0; i < arr.size(); i++){
            System.out.println("Index " + i + " is: " + arr.get(i));
        }
    }

    public int size(){
        return arr.size();
    }

    public boolean isEmpty(){
        return arr.get(0) == null;
    }
}




/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */
