package Exception;

public class Age {

	public static void main(String[] args) 
	{
		 java.util. Scanner sc =new  java.util.Scanner (System.in);

		int age=sc.nextInt();
		if(age<18)
		{
       throw new YoungAgeException("your not eligible");

	} else 
		
		{
		throw new YoungAgeException("your eligible");
		
		}
	}
}
