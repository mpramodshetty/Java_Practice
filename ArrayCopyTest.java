package practice;

public class ArrayCopyTest
{

	public static void main(String[] args) 
	{
		String [][] employeeName={
				{"Jahn","Frank","Wess","Pat","Donald"},
				{ "Stan", "Beth", "Harold", "Kevin" },
				{ "Gary", "Greg", "Les", "Karen", "Tom", "Abe" },
				{ "Pete", "Clari", "Seth", "Arnold", "Abdul" }};
		String[] employeeNameWhoGetshike=new String[3];
		System.arraycopy(employeeName[3], 0, employeeNameWhoGetshike, 0, 3);
		
		
		int employeeName_Length = employeeName[3].length;
		int employeeNameWhoGetshike_Length = employeeNameWhoGetshike.length;
		
		System.out.println("Copy From employeeName[2]: ");
		
		for(int i=0;i<employeeName_Length;i++)
		{
			System.out.println(employeeName[3][i]+" ");
		}
		System.out.println();
		System.out.println("Copy From employeeNameWhoGetshike: ");
		
		for(int j=0;j<employeeNameWhoGetshike_Length;j++)
		{
			System.out.println(employeeNameWhoGetshike[j]+" ");
		}
		
	}

}
