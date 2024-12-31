import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int x = scanner.nextInt();

        int fno = 0;
        int sno = 1;

        System.out.println(fno);
        System.out.println(sno);

        for (int i = 0; i < x - 2; i++) {
            int tno = fno + sno;
            System.out.println(tno);

            fno = sno;
            sno = tno;
        }

    }
}
