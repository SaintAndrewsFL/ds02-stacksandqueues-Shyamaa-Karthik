import java.util.LinkedList;

public class StackLL<T> {
    private LinkedList<T> arr = new LinkedList<T>();

    public T push(T item){
        arr.addFirst(item);
        return item;
    }

    public T pop(){
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
        return arr.getFirst() == null;
    }
}


/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */