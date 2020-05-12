public class CircularQueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Solution.enQueue(queue, 12);
        Solution.enQueue(queue, 22);
        Solution.enQueue(queue, 6);

        Solution.displayQueue(queue);

        Solution.deQueue(queue);

        System.out.println("\nAfter dequeue: ");
        Solution.displayQueue(queue);
    }
}
