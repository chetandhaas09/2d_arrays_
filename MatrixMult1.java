import java.util.Scanner;

class MatrixMult1 
{
    public static void main(String args[]) 
	{
        Scanner scan = new Scanner(System.in);
        int r1 = 2, c1 = 3, r2 = 3, c2 = 2;

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];

        
        for (int i = 0; i < r1; i++) 
		{
            for (int j = 0; j < c1; j++) 
			{
                System.out.print("Enter element of a[" + i + "][" + j + "]: ");
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < r2; i++) 
		{
            for (int j = 0; j < c2; j++) 
			{
                System.out.print("Enter element of b[" + i + "][" + j + "]: ");
                b[i][j] = scan.nextInt();
            }
        }

        
        if (c1 == r2) 
		{
            System.out.println("Matrix after multiplication:");
            for (int i = 0; i < r1; i++)
				{
                for (int j = 0; j < c2; j++) 
				{
                    c[i][j] = 0;
                    for (int k = 0; k < c1; k++) 
					{
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            for (int i = 0; i < r1; i++)
				{
                for (int j = 0; j < c2; j++) 
				{
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
		else
			{
				System.out.println("Multiplication is not possible.");
			}
    }
}