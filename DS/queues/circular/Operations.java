package queues.circular;

public class Operations {
    private int maxSize;
    private int rear;
    private int front;
    private int[] queue;
    Operations(int size){
        this.rear=-1;
        this.front=-1;
        this.queue=new int[size];
        maxSize=size;
    }
    public void enqueue(int ele){
        if(isFull()){
            System.out.println("Circular queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queue[rear] = ele;
            return;
        }
        rear=(rear+1) % maxSize;
        queue[rear]=ele;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Circular queue is empty");
            return;
        }
        System.out.println(queue[front]+" dequeued");
        if(front==rear) front=rear=-1;
        else front=(front+1)%maxSize;
    }
    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Circular queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if(i==rear) break;
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }
    public Integer getFront() {
        if(isEmpty()){
            System.out.println("Circular Queue is empty");
            return null;
        }
        return queue[front];
    }
    
    public Integer getRear() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty");
            return null;
        }
        return queue[rear];
    }
}
