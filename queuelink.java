// Collection framework: Queue LinkedList
import java.util.LinkedList;
import java.util.Queue;
public class queuelink{
public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(1);
    q.offer(2);
    q.offer(3);
    q.offer(4);
    System.out.println(q);
    // deleting an element 
    q.poll();
    System.out.println(q);
    // displaying the front
    System.out.println(q.peek());
}
}