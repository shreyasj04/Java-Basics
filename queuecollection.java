//Collection Framewok : PriorityQueue
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class queuecollection {
    public static void main(String[] args) {
     
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(100);
        q.offer(20);
        q.offer(80);
        q.offer(7);
        q.offer(10);
        System.out.println(q);
        //delete element from queue
        q.poll();
        System.out.println(q);
        //displaying the 1st element by priority(higher element have higher priority)
        System.out.println(q.peek());
        //deleting the element
        q.poll();
        System.out.println(q);

    }
}
