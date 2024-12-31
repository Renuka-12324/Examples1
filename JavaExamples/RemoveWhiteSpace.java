public class RemoveWhiteSpace {
    public static void main(String[] args) {

        String input = "  Hello   World  2024   Java Programming  ";


        String output = input.replaceAll("\\s", "");

        System.out.println("Original String: " + input );
        System.out.println("String after removing white spaces: " + output );
    }
}
