import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPascalsTriangle(n);
    }

        // TODO: Print Pascal's Triangle for n rows
        //       Values on each row separated by single space
        //       No leading or trailing spaces
        //
        // Input: 5
        // Output:
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                // Print the current number
                System.out.print(number);
                
                // Print a space only if it's not the last number in the row
                if (j < i) {
                    System.out.print(" ");
                }

                // Calculate the next number in the row using binomial coefficients:
                // C(n, k+1) = C(n, k) * (n - k) / (k + 1)
                number = number * (i - j) / (j + 1);
            }
            // Move to the next line after each row
            System.out.println();
        }
        
    
}
