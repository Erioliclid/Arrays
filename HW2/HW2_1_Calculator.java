package HW2;

import java.util.Scanner;
import java.io.IOException;

public class HW2_1_Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void calc() throws IOException {
        double a;
        double b;
        char c;
        System.out.println("Enter first number: ");
        a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        b = scanner.nextDouble();
        System.out.println("Enter operation: ");
        c = (char) System.in.read();
        switch (c) {
            case ('/'):
                System.out.println(a / b);
                break;
            case ('*'):
                System.out.println(a * b);
                break;
            case ('-'):
                System.out.println(a - b);
                break;
            case ('+'):
                System.out.println(a + b);
                break;
            default:
                System.out.println("Wrong operation");

        }
    }

    public static void main(String[] args) throws IOException {
        calc();
    }
}
