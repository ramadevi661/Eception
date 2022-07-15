package Exception;

public class Practice {

	public static void main(String[] args) 
	{
			   try
			   {  
			      //code that may raise exception  
				   String s=null;
				   System.out.println(s.length());
				   
			     // int data=100/0;  
			   }
			   
			   //catch(ArithmeticException e)
			   catch(Exception e)
			   {
			   e.printStackTrace();
			   }
			   finally
			   { 
			   //rest code of the program   
			   System.out.println("rest of the code...");  
			  } 
	}
}