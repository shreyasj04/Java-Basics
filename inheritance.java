//OOP concept : Inheritance (Multilevel)
class parent{
        void meth1(){
        System.out.println("This is the parent class ");
    }
};
class child extends parent{
    void meth2(){
        System.out.println("This is the child class ");
    }
};
public class inheritance extends child {
    public static void main(String[] args) {
        inheritance i=new inheritance();
        i.meth1();
        i.meth2();
    }
}
