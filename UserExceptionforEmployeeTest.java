package practice;
class MyOwnException extends RuntimeException {//note always keep user defined exceptions as Unckecked by extending RuntimeException
	   MyOwnException(String msg){
	      super(msg);
	   }
	}

public class UserExceptionforEmployeeTest {
	static void  employeeAge(int age) throws MyOwnException
	{
	      if(age < 0)
//Similarly other exceptions can be used such as NullPointerException,ArrayIndexOutOfBoundsException
	         throw new MyOwnException("Age can't be less than zero");//
	      else
	         System.out.println("Input is valid!!");
	   }

	
	public static void main(String[] args) {
		try {
            employeeAge(-1);
            employeeAge(1);
            //System.exit(0); //finally block will not be execute if this present in try block.
       }
		
       catch (MyOwnException e) {
    	   System.out.println("Age cannot be less than 0");
           e.printStackTrace();
    	   
           
       }
		finally
		{
		System.out.println("Finally block present");
		}
	}

}
