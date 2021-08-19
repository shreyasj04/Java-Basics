//Collection framework : LinkedList
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class linkList {
    public static void main(String[] args) {
        List<Integer> li=new LinkedList<>();
        li.add(100);
        li.add(200);
        li.add(300);
        li.add(400);
        li.add(500);
        li.add(600);
        System.out.println(li);
        li.add(4);  // This will add 4 at the end of the List.
        System.out.println(li);

        li.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(li);

        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        li.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(li);

        System.out.println(li.get(1));
    }
}
