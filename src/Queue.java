public class Queue<T extends Comparable>{

    Node<T> head;
    Node<T> tail;
    public int queueSize;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    // Method to push a new node at the front/head of the queue
    public void enQueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            tail = newNode;
            head = tail;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        queueSize++;
    }

    // Method to remove a new node at the tail/rear of the queue
    public Node<T> deQueue() {
        if (head != null) {
            Node<T> deletion = this.head;
            head = head.next;
            queueSize--;
            return deletion;
        }
        return null;
    }

    // Method to display the queue nodes
    @Override
    public String toString(){
        StringBuilder stb =  new StringBuilder();
        if(head==null)
            stb.append("");
        else {
            Node<T> frontQueue = this.head;
            while (frontQueue!= null) {
                stb = stb.append(frontQueue.data);
                stb.append("<--");
                frontQueue = frontQueue.next;
            }
        }
        stb.append("NULL");
        return stb.toString();
    }

    // Method to access the queue size
    public int getQueueSize() {
        return queueSize;
    }
}
