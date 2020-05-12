public class Solution {
    static void enQueue(Queue  queue, int value) {
        Node  temp = new Node(value);
        if (queue.front ==  null)
            queue.front = temp;
        else
            queue.rear.link = temp;

        queue.rear = temp;
        queue.rear .link = queue.front;
    }

    static  int deQueue(Queue  queue) {
        if (queue.front ==  null) {
            System.out.print("Queue is empty");
            return -1;
        }

        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front =  null;
            queue.rear =  null;
        }
        else {
            Node  temp = queue.front;
            value = temp .data;
            queue.front = queue.front.link;
            queue.rear.link= queue.front;
        }

        return value ;
    }

    static void displayQueue( Queue  queue) {
        Node temp = queue.front;
        System.out.print("Elements in Circular Queue are: ");
        while (temp.link != queue.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
}
