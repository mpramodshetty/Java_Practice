package practice;

public class CharArrayToString 
{

	public static void main(String[] args) 
	{
		char[] ch = {'p','r','a','m','o','d'};
		
		// Method 1: Using String object
		String str = new String(ch);
		
		System.out.println(str);
		
		 // Method 2: Using valueOf method
		String str2 = String.valueOf(ch);
		
		System.out.println(str2);
	}

}
