import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - UC8: Use Map for Character Patterns and Render via Function
 * * This use case utilizes the Collections Framework (HashMap) to manage character
 * patterns, improving modularity and lookup efficiency compared to linear search.
 */
public class OOPSBannerApp8 {

    public static void main(String[] args) {
        // 1. Initialize the pattern map
        Map<Character, String[]> charMap = createCharacterMap();

        // 2. Define the message to display
        String message = "OOPS";

        // 3. Display the banner
        displayBanner(message, charMap);
    }

    /**
     * Creates and populates a HashMap with ASCII art patterns.
     * Key: Character, Value: String array representing the rows of the pattern.
     */
    public static Map<Character, String[]> createCharacterMap() {
        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });

        charMap.put('P', new String[]{
            " ***** ",
            " * *",
            " ***** ",
            " * ",
            " * "
        });

        charMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });

        return charMap;
    }

    /**
     * Renders the message as a banner by iterating through each row 
     * and appending character patterns side-by-side.
     */
    public static void displayBanner(String message, Map<Character, String[]> charMap) {
        // Assume all patterns have the same height (5 rows in this case)
        int patternHeight = 5;
        char[] characters = message.toUpperCase().toCharArray();

        // Outer loop handles each line (row) of the banner
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            // Inner loop builds the current line by looking up each character's pattern
            for (char ch : characters) {
                if (charMap.containsKey(ch)) {
                    String[] pattern = charMap.get(ch);
                    sb.append(pattern[line]).append("  "); // Adding space between characters
                }
            }
            // Print the assembled line
            System.out.println(sb.toString());
        }
    }
}