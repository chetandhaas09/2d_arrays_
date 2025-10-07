class TwoDArray1
{
	public static void main(String args[])
	{
		int[][]a={{2,0,-4},{5,1,4},{8,0,5},{7,2,6}};
		System.out.println("2 D array is: \n");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}