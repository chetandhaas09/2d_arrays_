/* convert upper tringular matrix of given matrix 
1 2 3           1 2 3
4 5 6   to      0 5 6
7 8 9           0 0 9
*/

import java.util.Scanner;
class UpperTriMatrix
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int r=3, c=3;
		int [][] a= new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(":enter element of a [" + i + "][" + j + "] ");
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i>j)
					a[i][j]=0;
			}
		}
	
		System.out.println("upper trangular matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
				System.out.println(" ");
			}
		}
	}
}