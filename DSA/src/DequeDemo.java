import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        // Deque : Insertion and deletion at both ends
        // Using ArrayDeque
        Deque<Integer> deq = new ArrayDeque<Integer>();
        /*
         * Deque Operation
         * poll() : Same as queue
         * offer() : same as queue
         * 
         * pollFirst() : remove from first position
         * pollLast() : remove from last position
         * 
         * offerFirst() : Add at first 
         * offerLast() : Add at last
         * 
         */

        //  offer()
        deq.offer(10);
        deq.offer(20);

        // deque : [10,20]

        // offerFirst()
        deq.offerFirst(5);

        // deque : [5,10,20]
        

        //  poll()
        deq.poll();
        deq.poll();
        deq.poll();

        // deque : []
       

        deq.offer(10);
        deq.offerLast(100);
        deq.offer(20);
        deq.offerLast(40);
        // deq : [20,10,100,40]
       

        // offerFirst()
        deq.offerFirst(5);
        deq.offerFirst(2);

        System.out.println(deq);

        // peek() and peekFirst() : gives first element
        System.out.println(deq.peekFirst());

        // peekLast() : gives first element
        System.out.println(deq.peekLast());



    }
}
