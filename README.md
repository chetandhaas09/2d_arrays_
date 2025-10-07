
## 📌 What You'll Learn

- How to declare and initialize a 2D array
- How to traverse a 2D array using nested loops
- How to perform matrix operations like addition, multiplication, and transpose
- How to format output for better readability

## 🧑‍💻 Sample Code: Traversing a 2D Array

```java
public class ArrayBasics {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
