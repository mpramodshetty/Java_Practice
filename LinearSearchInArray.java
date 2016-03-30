package practice;

public class LinearSearchInArray {

	public static int linearSearch(int[] list, int key) 
	{
		for (int i = 0; i < list.length; i++) 
		{
		if (key == list[i])
		return i;
		}
		return -1;
		}
	

	public static void main(String[] args) 
	{	
		int[] Array = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(Array, 0);
		int r = linearSearch(Array, 5);
		int u = linearSearch(Array, 1);
		
		System.out.println(i+" "+r+" "+u);
	}
	
}


