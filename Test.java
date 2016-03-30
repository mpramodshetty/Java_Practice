package practice;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number = 0;
		int[] numbers = new int[1];
		m(number, numbers);
		System.out.println("number is " + number
		+ " and numbers[0] is " + numbers[0]);
		}
		public static void m(int x, int[] y)
		{
		x = 3;
		y[0] = 3;
		}
		//o/p:-number is 0 and numbers[0] is 3 
		//primitive data type references are different where as Arrays ref are same

	}


