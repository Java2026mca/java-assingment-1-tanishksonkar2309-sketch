import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

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
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number);
                // Calculate next number using Binomial Coefficient property: 
                // nCr = (nCr-1 * (n - r)) / r
                number = number * (i - j) / (j + 1);
                
                // Add space only if it's not the last element in the row
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
   /* public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                // Print the current number
                System.out.print(number);
                
                // Print a space only if it is not the last element in the row
                if (j < i) {
                    System.out.print(" ");
                }
                
                // Calculate the next number in the row using the binomial coefficient property:
                // C(n, k) = C(n, k-1) * (n - k + 1) / k
                number = number * (i - j) / (j + 1);
            }
            // Move to the next line after each row
            System.out.println();
        }
        
    }*/
}
