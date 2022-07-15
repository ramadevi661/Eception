package Exception;

public class Userdefine {

public static void main(String args[])
{
 try {
   // Throw an object of user defined exception
   throw new MyException("Aadhar exception");
 }
 catch (MyException ex) {
   System.out.println("");

   // Print the message from MyException object
   System.out.println(ex.getMessage());
 }
}
}


class MyException extends Exception 
{
public MyException(String s)
{
 // Call constructor of parent Exception
 super(s);
}
}
