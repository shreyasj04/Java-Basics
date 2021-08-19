//OOP concept : interface
interface interDemo{
    void inter1(int a);
}
public class interfaceDemo implements interDemo {
    public void inter1(int a){
        System.out.println("Value of a is "+a);
    }
    public static void main(String[] args) {
        interfaceDemo i=new interfaceDemo();
        i.inter1(10);
    }
}
