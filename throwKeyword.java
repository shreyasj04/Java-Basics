// user-defined expception
class MyException extends Exception{
    
}
  
// A Class that uses above MyException
public class throwKeyword{
    
    public static void main(String args[])
    {
        try{
    
            throw new MyException();
        }
        catch (MyException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}