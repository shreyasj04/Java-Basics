//java constrcutor demo
public class constructorExample {
    public constructorExample(){
        System.out.println("This is a constructor from class constructorExmple ");
    }
    public static void main(String[] args) {
        System.out.println("Constructor is invoked whenever object is created ");
        constructorExample c=new constructorExample();
    }
}
