package practice;

import java.util.Arrays;

public class Array1 
{

	public static void main(String[] args) 
	{
		int[] integerArray = {27, 18, -553, 95, 62, -37, 783};
		//Arrays.fill(integerArray, 2, integerArray.length-3, 10);
		//Arrays.sort(integerArray);
		for(int i=0;i<integerArray.length;i++)
		{
			System.out.print(integerArray[i]+" ");
		}
		System.out.println("--integerArray");
		
		int[] integerArryCopy = integerArray;
		
		boolean areArrayEqual = Arrays.equals(integerArryCopy, integerArray);
		System.out.println(areArrayEqual);
		
		int[] integerArrayCopy_2 = new int[7];
		System.arraycopy(integerArray, 0, integerArrayCopy_2, 0, 7);
		//Arrays.sort(integerArray);
		Arrays.fill(integerArray, 3, integerArray.length-1, 100);
		
		areArrayEqual=Arrays.equals(integerArray, integerArrayCopy_2);
		System.out.println(areArrayEqual);
		
		int position = Arrays.binarySearch(integerArray, 18);
		System.out.println(position);
	}

}
