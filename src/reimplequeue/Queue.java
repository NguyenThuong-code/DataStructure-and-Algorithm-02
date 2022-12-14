package reimplequeue;

public class Queue {
    Node front, rear;

   public static void enQueue(Queue q, int value){
        Node temp= new Node();
        temp.data= value;
        if (q.front==null)
            q.front = temp;
        else
            q.rear.link=temp;
        q.rear=temp;
        q.rear.link= q.front;
    }
   public static int deQueue(Queue q){
        if (q.front== null){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front== q.rear){
            value=q.front.data;
            q.front=null;
            q.rear=null;

        }else {
            Node temp = q.front;
            value=temp.data;
            q.front=q.front.link;
            q.rear.link=q.front;
        }
        return value;
    }
    public void displayQueue(){
       Node temp=front;
        System.out.println("Element in Circular Queue are:");
        while (temp.link!= front){
            System.out.printf("%d ",temp.data);
            temp= temp.link;
        }
        System.out.println(temp.data);
    }

}
