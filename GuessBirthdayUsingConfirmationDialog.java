package practice;

public class GuessBirthdayUsingConfirmationDialog {

	
	public static void main(String[] args) 
	{
		        
		
		double[] myList = new double[10];
		for (int i = 1; i < myList.length; i++)
		{
			myList[i] = i;
			//System.out.print(myList[i]+" ");
			
		}
		for(double ele:myList)
		{
			System.out.println(ele);
		}
		//size of array can't changed once assign
		int x = 30;
		int[] numbers = new int[x];
		x = 60;
		System.out.println("x is " + x);
		System.out.println("The size of numbers is " + numbers.length);
		

}
}
