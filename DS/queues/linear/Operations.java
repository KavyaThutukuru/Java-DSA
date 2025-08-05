package queues.linear;
public class Operations {
    private int maxSize;
    private int[] queue;
    private int rear;
    private int front;
    Operations(int size){
        this.rear=-1;
        this.front=-1;
        this.queue=new int[size];
        maxSize=size;
    }
    public void enqueue(int ele){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if (front==-1) front = 0; 
        queue[++rear]=ele;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element is "+queue[front]);
        front++;
        if (front > rear){ 
            front = -1;
            rear = -1;
        }
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public Integer getFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[front];
    }
    
    public Integer getRear() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return queue[rear];
    }
}

