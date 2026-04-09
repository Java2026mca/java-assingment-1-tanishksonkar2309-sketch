import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *
        public static void printHollowDiamond(int n) {
    // Upper half and middle
    for (int i = 0; i < n; i++) {
        // Leading spaces
        for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
        
        System.out.print("*");
        
        if (i > 0) {
            // Inner spaces: (2 * row_index) - 1
            for (int j = 0; j < (2 * i) - 1; j++) System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
    }

    // Lower half
    for (int i = n - 2; i >= 0; i--) {
        // Leading spaces
        for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
        
        System.out.print("*");
        
        if (i > 0) {
            // Inner spaces
            for (int j = 0; j < (2 * i) - 1; j++) System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
    }
}
