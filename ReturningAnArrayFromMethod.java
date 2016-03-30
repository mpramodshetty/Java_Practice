package practice;

public class ReturningAnArrayFromMethod 
{
public static int[] reverse(int[] list)
{
	int[] result = new int[list.length];
	for (int i = 0, j = result.length - 1;i < list.length; i++, j--)
	{
		result[j] = list[i];
	}
	return result;
	
}
	
	public static void main(String[] args) 
	{
		int[] list1 = {1, 2, 3, 4, 5, 6};
		int[] list2 = reverse(list1);
		int len=list1.length;
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			System.out.print(list1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<list2.length;i++)
		{
			System.out.print(list2[i]+" ");
		}
			
		
		
	}

}
