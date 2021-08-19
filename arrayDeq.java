import java.util.ArrayDeque;
public class arrayDeq {
    public static void main(String[] args) {
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    adq.offer(100);
    adq.offer(200);
    //Inserting element at first position
    adq.offerFirst(12);
    //Inserting element at last position
    adq.offerLast(7);
    adq.offerLast(20);
    System.out.println(adq);
    //Displaying first element
    System.out.println(adq.peekFirst());
    //Displaying last element
    System.out.println(adq.peekLast());
    //Displaying the front element 
    System.out.println(adq.peek());
    // Deleting front element
    System.out.println(adq.poll());
    System.out.println("Front element"+adq);
    //Deleting first element
    System.out.println(adq.pollFirst());
    System.out.println("First element" + adq);
    //Deleting last element
    System.out.println(adq.pollLast());
    System.out.println("Last element"+adq);
}
}
