import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Implement a stack using an array (no Java Stack class)
        //       Process n operations:
        //         PUSH x  → push integer x
        //         POP     → pop top, print it; if empty print "EMPTY"
        //         PEEK    → print top without removing; if empty print "EMPTY"
        //         SIZE    → print current number of elements
        //
        // Input:
        // 6
        // PUSH 10
        // PUSH 20
        // PEEK
        // POP
        // POP
        // POP
        //
        // Output:
        // 20
        // 20
        // 10
        // EMPTY
int[] stack = new int[n];
        int top = -1; // Index of the current top element

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equalsIgnoreCase("PUSH")) {
                int value = sc.nextInt();
                stack[++top] = value; // Increment top and insert
            } 
            else if (command.equalsIgnoreCase("POP")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top--]); // Print and decrement top
                }
            } 
            else if (command.equalsIgnoreCase("PEEK")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]); // Print current top without removing
                }
            } 
            else if (command.equalsIgnoreCase("SIZE")) {
                System.out.println(top + 1); // Size is always top index + 1
            }
        }
        sc.close();
    }
}
