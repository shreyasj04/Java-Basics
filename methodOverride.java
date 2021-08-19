//OOP concept : polymorphism(method overrriding) 
class block1{
    void meth1(){
        System.out.println("This is block 1 ");
    }
}
class block2 extends block1{
    void meth1(){
        System.out.println("This is block 2 ");
    }
}
public class methodOverride extends block2 {
    public static void main(String[] args) {
        methodOverride m=new methodOverride();
        m.meth1();
    }
}
