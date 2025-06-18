import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter first number (or 'exit' to quit): ");
                String input1 = scanner.nextLine();
                if (input1.equalsIgnoreCase("exit")) break;
                System.out.print("Enter an operator (+, -, *, /): ");
                String operator = scanner.nextLine();
                System.out.print("Enter second number: ");
                String input2 = scanner.nextLine();
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                double result;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + operator);
                }
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
            System.out.println();
        }
        scanner.close();
        System.out.println("Calculator exited.");
    }
}
