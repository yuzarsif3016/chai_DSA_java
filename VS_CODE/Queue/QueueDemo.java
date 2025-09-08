class CustomQueue{
    private int[] arr;
    int front;
    int rear;
    int size;

    CustomQueue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear == size - 1;
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear++;
        arr[rear] = element;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return element;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return rear - front + 1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class CircularQueue{
    private int[] arr;
    int front;
    int rear;
    int size;

    CircularQueue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = element;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return element;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        if(rear >= front){
            return rear - front + 1;
        } else {
            return size - front + rear + 1;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(rear >= front){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            for(int i = front; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}

class DoubleEndedQueue{
    private int[] arr;
    int front;
    int rear;
    int size;

    DoubleEndedQueue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    public void enqueueFront(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + size) % size;
        }
        arr[front] = element;
    }
    public void enqueueRear(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear] = element;
    }
    public int dequeueFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return element;
    }
    public int dequeueRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[rear];
        if(front == rear){
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + size) % size;
        }
        return element;
    }
    public int peekFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public int peekRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[rear];
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        if(rear >= front){
            return rear - front + 1;
        } else {
            return size - front + rear + 1;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(rear >= front){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            for(int i = front; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70); // Queue is full
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.dequeue()); // Queue is empty
      

    }
}