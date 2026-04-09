import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Fill an N×N matrix in clockwise spiral order starting from 1
        //       Print each row with values separated by single space
        //       Then print: "Diagonal: X" where X = sum of primary diagonal (top-left to bottom-right)
        //
        // Input: 3
        // Output:
        // 1 2 3
        // 8 9 4
        // 7 6 5
        // Diagonal: 15
int[][] matrix = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        // Fill matrix spirally
        while (top <= bottom && left <= right) {
            // Move Right
            for (int i = left; i <= right; i++) matrix[top][i] = value++;
            top++;
            // Move Down
            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;
            // Move Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
                bottom--;
            }
            // Move Up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
                left++;
            }
        }
        // Print Matrix and Calculate Diagonal
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? "" : " "));
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal: " + diagonalSum);
    }
}
