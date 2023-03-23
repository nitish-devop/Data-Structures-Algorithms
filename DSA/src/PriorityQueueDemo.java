import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Priority Queue : Put minimum element on top
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);
        pq.offer(1);
       
        System.out.println(pq);

        // Priority Queue : Put minimum element on top
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Comparator.reverseOrder());
        pq_max.offer(20);
        pq_max.offer(30);
        pq_max.offer(10);
        pq_max.offer(1);
       
        System.out.println(pq_max.peek());
    }
}
