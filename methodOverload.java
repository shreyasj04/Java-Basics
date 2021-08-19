//OOP concept : Polymorphism(method Overloading)
public class methodOverload {
    void meth1(int a){
        System.out.println("This is method 1, value of a is "+a);
    }
    int meth1(int a,int b){
        int sum=a+b;
        System.out.println("Sum is "+sum);
        return 0;
    }
    public static void main(String[] args) {
        methodOverload m=new methodOverload();
        m.meth1(20);
        m.meth1(30,30);
    }
}
