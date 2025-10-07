// 2d array

class SumOfAllElements
{
	public static void main(String args[])
	{
		int [][]a={{1,2,3},{5,3,2},{1,8,0}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				sum=sum+a[i][j];
				
		}
		System.out.println("sum is:"+sum);
	}
}