/*  given a matrix, print a matrix in asorted array
first we can convert matrix into arrray and after sorting we can convert a 
array into the matrix  we can sort array using Arrays.Sort(arr) method */

import java.util.Arrays;
class MatrixSort
{
	public static void main(String args[])
	{
		int[][] a={{4,2,9},{3,1,5},{7,2,6}};
		int[] arr=new int[9];
		int index=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[index++]=a[i][j];
			}
		}
		Arrays.sort(arr);
		index=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=arr[index++];
			}
		}
		System.out.println("matrix in sorted order:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
			}
	}
}