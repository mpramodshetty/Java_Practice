package practice;

public class FinallyBlock_Test {
	
	public static int myMethod()
	   {
	       try {
	            //try block
	            return 0;
	       }
	       catch(Exception e)
	       {
	    	   return 2;
	       }
	       finally {
	    	   //return 3; will override above returns
	            //finally
	            System.out.println("Inside Finally block");
	       }
	   }

	
	public static void main(String[] args) 
	{
		System.out.println(FinallyBlock_Test.myMethod());
	}
	}

//output: Inside Finally block
        //0