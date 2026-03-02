/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Define and populate the String array in a single statement
        // Each String.join call constructs one horizontal line of the "OOPS" banner
        String[] lines = {
            String.join("  ", " *** ", " *** ", "******", " **** "),
            String.join("  ", "** **", "** **", "** **", "** **"),
            String.join("  ", "** **", "** **", "** **", "** "),
            String.join("  ", "** **", "** **", "******", " **** "),
            String.join("  ", "** **", "** **", "** ", "    **"),
            String.join("  ", "** **", "** **", "** ", "** **"),
            String.join("  ", " *** ", " *** ", "** ", " **** ")
        };

        // Use an enhanced for-loop (for-each) to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}