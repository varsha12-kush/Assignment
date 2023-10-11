import java.util.*;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert input to lowercase to handle both upper and lower case characters
        input = input.toLowerCase();
        
        // Create a set to store unique characters
        Set<Character> charSet = new HashSet<>();
        
        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check if the character is an alphabet
            if (Character.isAlphabetic(c)) {
                charSet.add(c);
            }
        }
        
        // Check if the set size is 26 (number of alphabets)
        return charSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
