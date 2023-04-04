import java.util.Scanner;

public class javaFun {
    public static void main(String[] args) {
        char ch = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Welcome to my Java arithmetic calculator:");
        // The user will be prompted to enter an operation to perform
        System.out.print("Choose operation to perform (+,-,*,/,%): ");
        // Scanner class object is used to read user input
        Scanner sc = new Scanner(System.in);
        // next() method reads the next complete token from the scanner
        ch = sc.next().charAt(0);

        // The user will be prompted to enter two numbers
        // nextInt() method reads the next integer value from the scanner
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        // switch statement is used to perform different actions based on different conditions
        switch (ch) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            case '%':
                result = modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);
    }

    // multi parameter methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }
}