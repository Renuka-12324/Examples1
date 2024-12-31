import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        long fact = 1;

        for (int i = x; i > 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + x + " is: " + fact);

    }
}
