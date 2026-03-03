import java.util.*;

public class OOPSBannerApp7 {

    // ==========================
    // Inner Class
    // ==========================
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // ==========================
    // Static Map to store patterns
    // ==========================
    private static Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

    // ==========================
    // Initialize Character Patterns
    // ==========================
    public static void initializePatterns() {

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    // ==========================
    // Generate Banner
    // ==========================
    public static String generateBanner(String input) {

        StringBuilder banner = new StringBuilder();
        input = input.toUpperCase();

        for (int row = 0; row < 5; row++) {

            for (char ch : input.toCharArray()) {

                CharacterPatternMap cp = patternMap.get(ch);

                if (cp != null) {
                    banner.append(cp.getPattern()[row]).append("  ");
                }
            }

            banner.append("\n");
        }

        return banner.toString();
    }

    // ==========================
    // Main Method
    // ==========================
    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        String banner = generateBanner(word);

        System.out.println("===== OOPS BANNER =====");
        System.out.println(banner);
    }
}