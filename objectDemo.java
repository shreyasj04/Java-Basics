//java objects demo
public class objectDemo {
    int var;
    void printvalue()
    {
        System.out.println("value of x is "+var);
    }
    public static void main(String[] args) {
        objectDemo d=new objectDemo();
        d.var=10;
        d.printvalue();

    }
}
