public class SpecialCharacter {
    public static void main(String[] args) {

        String input = "Hello@World!#2024$%Java&Programming*()";

        String output = input.replaceAll("[^a-zA-Z0-9\\s]", "");

        System.out.println("Original String: " + input);
        System.out.println("String after removing special characters: " + output);
    }
}
