import java.util.Scanner;

class UpperTriangularMatrix
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = 3, c = 3;
        int[][] a = new int[r][c];

        // Input matrix elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element a[" + i + "][" + j + "]: ");
                a[i][j] = scan.nextInt();
            }
        }

        // Convert to upper triangular matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i > j)
                    a[i][j] = 0;
            }
        }

        // Display the upper triangular matrix
        System.out.println("\nUpper triangular matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}