import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string:");
        String s = sc.nextLine();
        String r = "";

        for(int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            r = r + c;
        }

        if (r.equals(s)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}
