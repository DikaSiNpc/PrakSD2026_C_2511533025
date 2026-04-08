package Pekan3_2511533025;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533025 {
    public static int postfixEvaluate(String expression) {
        Stack<Integer> s_3025 = new Stack<Integer>();
        Scanner input_3025 = new Scanner(expression);
        while (input_3025.hasNext()) {
            if (input_3025.hasNextInt()) {      // an operand (integer)
                s_3025.push(input_3025.nextInt());
            } else {                       // an operator
                String operator = input_3025.next();
                int operand2 = s_3025.pop();
                int operand1 = s_3025.pop();
                if (operator.equals("+")) {
                    s_3025.push(operand1 + operand2);
                } else if (operator.equals("-")) {
                    s_3025.push(operand1 - operand2);
                } else if (operator.equals("*")) {
                    s_3025.push(operand1 * operand2);
                } else {
                    s_3025.push(operand1 / operand2);
                }
            }
            
        }
        input_3025.close();
        return s_3025.pop();
    }
    public static void main(String[] args) {
        System.out.println("hasil postfix= "+postfixEvaluate("5 2 4 * + 7 -"));
    }
}