/**
 * OOPSBannerApp UC6 - Refactor Banner Logic into Functions
 * Transitions from hardcoded logic to modular programming.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Step 1: Call helper methods to get the character patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 2: Use a loop to assemble and print each line
        // We use oPattern twice to represent "OO" in "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }

    // Static helper method for 'O' pattern
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }

    // Static helper method for 'P' pattern
    public static String[] getPPattern() {
        return new String[] {
            "******",
            "** **",
            "** **",
            "******",
            "** ",
            "** ",
            "** "
        };
    }

    // Static helper method for 'S' pattern
    public static String[] getSPattern() {
        return new String[] {
            " **** ",
            "** **",
            "** ",
            " **** ",
            "    **",
            "** **",
            " **** "
        };
    }
}