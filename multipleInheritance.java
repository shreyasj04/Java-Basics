//OOP concept : Inheritance(multiple)
interface block1{
    void method1();
}
class block2{
    void mehtod2(){
        System.out.println("This method belongs to class ");
    }
}
public class multipleInheritance extends block2 implements block1  {
    public void method1(){
        System.out.println("This method belongs to interface ");
    }
    public static void main(String[] args) {
        multipleInheritance ic=new multipleInheritance();
        ic.method1();
        ic.mehtod2();
    }
}
