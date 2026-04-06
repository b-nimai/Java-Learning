import java.util.Scanner;

public class Calculator {
    public static int calculate(int a, int b, char op) {
        if (op == '+')
            return a + b;
        else if (op == '-')
            return a - b;
        else if (op == '/') {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero");
                return 0;
            } else {
                return a / b;
            }
        } else if (op == '%')
            return a % b;
        return a * b;
    }

    public static double calculate(double a, double b, char op) {
        if (op == '+')
            return a + b;
        else if (op == '-')
            return a - b;
        else if (op == '/') {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero");
                return 0;
            } else {
                return a / b;
            }
        } else if (op == '%')
            return a % b;
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("If your inputs not in integers, then enter 2, otherwise 1");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter first Number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second Number: ");
            int num2 = scanner.nextInt();
            System.out.println("Enter operator(+, -, *, /, %): ");
            char op = scanner.next().charAt(0);
            System.out.println(calculate(num1, num2, op));
        } else {
            System.out.println("Enter first Number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second Number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Enter operator(+, -, *, /, %): ");
            char op = scanner.next().charAt(0);
            System.out.println(calculate(num1, num2, op));
        }
        scanner.close();
    }
}
