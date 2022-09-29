public class Queue<T> {

    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Pushes data to the top of the stack.
    public void enqueue (T value) {
        Node node = new Node(value);
        if (this.rear == null) {
            this.front = this.rear = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
    }

    // Pops data off the top of the stack
    public T dequeue () {
        if (this.front == null) return null;

        Node node = this.front;
        this.front = this.front.next;

        if (this.front == null) this.rear = null;

        return (T) node.data;
    }

    // Retrieves the value on the top of the stack
    public T front() {
        if (isEmpty()) {
            System.out.println("Queue Empty.");
            return null;
        }
        return (T) front.data;
    }

    // Retrieves the size of the stack.
    public int size() {
        int i = 0;

        var current = front;
        while (current != null) {
            current = current.next;
            i++;
        }
        return i;
    }

    // Returns true of the stack has no top (implying emptiness).
    public boolean isEmpty () {
        return front == null;
    }

    // Lets me print out the stack inside a print statement.
    @Override
    public String toString() {
        String str = "";
        Node current;
        current = front;
        while (current != null)
        {
            str += current.data + " ";
            current = current.next;
        }
        return str;
    }

    private class Node<T>
    {
        private T data;  //data field
        private Node next; //link field

        public Node(T item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}
