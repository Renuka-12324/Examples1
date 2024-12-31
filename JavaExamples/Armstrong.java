import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int temp = num;
        int sum = 0;
        int len = String.valueOf(temp).length();

        while (num > 0) {
            int last = num % 10;
            num = num / 10;
            sum += Math.pow(last, len);
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }

    }
}
