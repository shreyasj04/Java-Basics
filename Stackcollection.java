//Collection framework : Stack
import java.util.Stack;
public class Stackcollection {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("Audi");
        s.push("LandRover");
        s.push("Lambhorghini");
        s.push("BMW");
        System.out.println(s);
        //displaying the top
        System.out.println(s.peek());
        //delete the top
        s.pop();
        System.out.println(s);
    }
}
