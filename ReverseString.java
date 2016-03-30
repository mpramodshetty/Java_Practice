package practice;
//program to reverse the string and find whether is polindrome or not.
public class ReverseString {

	/**
	 * @param args
	 */
	//static String rev="";
	public static void main(String[] args) {
		
		String text = "Pramod";
		String str="";
		
		
		int len = text.length();
		for(int i=len-1;i>=0;i--)
		{
			str = str+text.charAt(i);		
			
		}	
		System.out.print(str);
		System.out.println();
		if(text.equals(str))
		{
			System.out.println("String is a polindrome");
		}
		else
		{
			System.out.println("String is not a polindrome");
		}
		
			
		
		
		/*List<String> list = Arrays.asList(text.split(" "));
		Set<String> uniquewords = new HashSet<String>(list);
		
		for (String word:uniquewords)
		{
			System.out.println(word + ": "+Collections.frequency(list, word));
			
		}*/

	}

}
