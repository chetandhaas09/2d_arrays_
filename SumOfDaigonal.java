/* find the sum of  daigonal element from a given matrix
 
1 4 0 3
4 2 1 3
5 5 2 0
8 8 6 1
*/
class SumOfDaigonal
{
	public static void main(String args[])
	{
		int [][]a={{1,4,0,3},{4,2,1,3},{5,5,2,0},{8,8,6,1}};
		int r=4, c=4;
		int sump=0, sums=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
					sump=sump+a[i][j];
				
				if(i+j==r-1)
					sums=sums+a[i][j];
			}
		}
		System.out.println("Sum of principle daigonal element are:"+sump);
		System.out.println("Sum of secondary daigonal element are:"+sums);
		
	}
}