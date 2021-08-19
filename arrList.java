import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class arrList {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(40);
        li.add(30);
        li.add(20);
        li.add(10);
        li.add(3);
        System.out.println(li);
        //adding element in position
        li.add(1,100);
        System.out.println(li);
        //append new list
        List<Integer> nli=new ArrayList<>();
        nli.add(50);
        nli.add(100);
        nli.add(150);
        nli.add(200);
        li.addAll(nli);
        System.out.println(li);
        //display element using its position
        System.out.println(li.get(5));
        //remove an element using position
        li.remove(5);
        System.out.println(li);
        //removing an element with its value
        System.out.println(li.remove(Integer.valueOf(150)));
        System.out.println(li);
        //updating the list
        li.set(1,2000); 
        System.out.println(li);
        //checking whether an element is there in list or not
        System.out.println(li.contains(200));
        //iterating via for loop
        for(int i=0;i<li.size();i++){
            System.out.println("Element is "+li.get(i));
        }
        //iterating via for each
        for(Integer Element : li){
            System.out.println(Element);
        }
        //iterating via iterator
        Iterator<Integer> i=li.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
