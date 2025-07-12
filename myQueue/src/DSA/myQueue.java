package DSA;

public class myQueue {
    private int[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public myQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }


    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public int size() {
        return size;
    }
    public void enqueue(int item) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            data[rear] = item;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }
    public int dequeue() {
        if (!isEmpty()) {
            int item = data[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }
        return -1;
    }
    public int front() {
        if (!isEmpty()) {
            return data[front];
        }
        return -1;
    }
    public int rear() {
        if (!isEmpty()) {
            return data[rear];
        }
        return -1;
    }

}
