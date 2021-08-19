import java.util.*;
public class builtExcep {
    public static void main(String[] args) throws ArithmeticException {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
        c=a/b;
        }
        catch(ArithmeticException e){
        System.out.println("Exception occurred ");
    }
}
}
