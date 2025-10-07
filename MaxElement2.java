class MaxElement2
{
	public static void main(String args[])
	{
	  int [][]a={{1,4,0,3},{4,2,1,3},{5,5,2,0},{8,8,6,1}};
	  int r=4;
	  int c=4;
	
	  
	  for(int i=0;i<r;i++)
	  {
		  int max=a[i][0];
		   for(int j=0;j<c;j++)
			{
			  if(max<a[i][j])
				  max=a[i][j];
			}
	  System.out.println("max element: " + (i+1) +" is "+ max);
	  }
	}
}