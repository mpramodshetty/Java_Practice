package practice;

public class TryCatch {

	public static void main(String[] args) 
	{
		
			int num1,num2;
			try
			{
				 int a[]=new int[7];
		         a[4]=30/0;
				//num1=0;
				//num2=60/num1;
				System.err.println("Entered try block");
				
			}
			catch(ArithmeticException e){
		        System.out.println("Warning: ArithmeticException");
		     }
		     catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("Warning: ArrayIndexOutOfBoundsException");
		     }
			catch(Exception e)//this catch(Exception e) should be the last option always 
			{
				// This block is to catch divide-by-zero error
	            System.err.println("Some other exception");
			}
			System.out.println("I'm out of try-catch block in Java.");
	}

}
