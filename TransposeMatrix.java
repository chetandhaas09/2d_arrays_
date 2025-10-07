/* transpose of matrix is interchangeing order of matrix 
i.e. we change coiumn into rows
1 2         1 3 4
3 0    to   2 0 5
4 5  */

class TransposeMatrix
{
	public static void main(String args[])
	{
	  int [][]a={{1,4,0,3},{4,2,1,3},{5,5,2,0},{8,8,6,1}};
	  int r=4;
	  int c=4;
	  
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  System.out.print(a[j][i]+ " ");
		  }
	  System.out.println(" ");
	  }
	  
	  
	}
}