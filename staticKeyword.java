//Static keyword
public class staticKeyword {
    static int a=10;
    static void staticMethod(){
        System.out.println("This is a static block with value "+a);
    }
    public static void main(String[] args) {
        //objects don't need to be created bcoz of static keyword
        a=30;
        staticMethod();
    }
}
