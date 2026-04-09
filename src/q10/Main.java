import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Evaluate a postfix (Reverse Polish Notation) expression
        //       Operands are non-negative integers, operators are: + - * /
        //       Use a stack to evaluate
        //       Input: single line, tokens separated by spaces
        //       Output: integer result
        //
        // Input: 5 1 2 + 4 * + 3 -
        // Output: 14
        //
        // Explanation: 5 + ((1+2)*4) - 3 = 5 + 12 - 3 = 14

        String line = sc.nextLine();
 String[] tokens = line.split("\\s+");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Check if token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop the top two elements (order matters for - and /)
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (token) {
                    case "+": stack.push(val1 + val2); break;
                    case "-": stack.push(val1 - val2); break;
                    case "*": stack.push(val1 * val2); break;
                    case "/": stack.push(val1 / val2); break; // Integer division
                }
            } else {
                // If not an operator, it must be an operand
                stack.push(Integer.parseInt(token));
            }
        }

        // The final result is the only item left in the stack
        System.out.println(stack.pop());
    }
}
