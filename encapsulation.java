//OOP concept : Encapsulation(access modifiers)
class privClass{
   protected int a=10,b=20;
    
}
public class encapsulation extends privClass  {
    void promethod() {
        System.out.println("value of a and b is "+a+" "+b);        
        }
    public static void main(String[] args) {
     encapsulation e=new encapsulation();
     e.promethod();
}
}
