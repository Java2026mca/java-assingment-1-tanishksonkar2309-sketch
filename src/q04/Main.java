import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Read n integers. For each number print:
        //   "Prime"     if it is prime
        //   "Perfect"   if it is a perfect number (sum of proper divisors == itself, e.g. 6=1+2+3)
        //   "Both"      if it is both (there are none < 100, but handle it)
        //   "Neither"   otherwise
        //
        // Input:
        // 4
        // 6 13 8 28
        //
        // Output:
        // Perfect
        // Prime
        // Neither
        // Perfect
for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) break;
            int num = sc.nextInt();
            
            boolean isP = isPrime(num);
            boolean isF = isPerfect(num);
            
            // Classification Logic
            if (isP && isF) {
                System.out.println("Both");
            } else if (isP) {
                System.out.println("Prime");
            } else if (isF) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }
        sc.close();
    }

    // A number is prime if it is > 1 and has no divisors other than 1 and itself
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // A number is perfect if the sum of its proper divisors equals itself
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1; // 1 is always a proper divisor for n > 1
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                int otherDivisor = n / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }
        return sum == n;
    
    }
}
