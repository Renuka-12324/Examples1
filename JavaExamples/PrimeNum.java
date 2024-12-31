import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.println(x + " is not a prime number.");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(x + " is a prime number.");
        }

    }
}
