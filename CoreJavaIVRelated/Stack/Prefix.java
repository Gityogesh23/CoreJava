import java.util.Stack;

public class Prefix{
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Traverse the expression from right to left
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // Convert character digit to integer and push onto stack
                stack.push(c - '0');
                System.out.println("Pushed " + (c - '0') + " onto the stack. Stack now: " + stack);
            } else {
                // Ensure there are enough operands on the stack
                if (stack.size() >= 2) {
                    int operand1 = stack.pop();
                    int operand2 = stack.pop();

                    int result = 0;
                    switch (c) {
                        case '+':
                            result = operand1 + operand2;
                            break;
                        case '-':
                            result = operand1 - operand2;
                            break;
                        case '*':
                            result = operand1 * operand2;
                            break;
                        case '/':
                            result = operand1 / operand2;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator: " + c);
                    }

                    // Push the result back onto the stack
                    stack.push(result);
                    System.out.println("Applied operator '" + c + "'. Result: " + result + ". Stack now: " + stack);
                } else {
                    // If there aren't enough operands, print error information
                    System.out.println("Error: Insufficient operands for operator '" + c + "'. Stack: " + stack);
                    throw new IllegalArgumentException("Invalid Prefix Expression: Insufficient operands");
                }
            }
        }

        // Check if there's exactly one element left in the stack, which is the result
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid Prefix Expression: Remaining operands");
        }

        return stack.pop(); // Return the final result
    }

    public static void main(String[] args) {
        String expression = "-+2*31/9";
        System.out.println("Prefix evaluation: " + evaluatePrefix(expression));
    }
}
