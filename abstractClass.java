//OOP concept : Abstraction
abstract class absClass{
    abstract void abMeth1();
}

public class abstractClass extends absClass{
    void abMeth1(){
        System.out.println("This is abstract method implemented in child class ");
    }
    public static void main(String[] args) {
        abstractClass a=new abstractClass();
        a.abMeth1();
        
    }
}
