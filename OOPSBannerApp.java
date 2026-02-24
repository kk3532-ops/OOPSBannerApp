// UC4 - OOPS Banner App
// Using String Array and Enhanced For Loop
// Demonstrates Array Creation, Population using String.join(), and Loop Traversal

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String Array to store banner lines
        String[] bannerLines = new String[6];

        // Step 2: Populate each line using String.join()
        bannerLines[0] = String.join("", " *****   *****   *****  ");
        bannerLines[1] = String.join("", "*     * *     * *     * ");
        bannerLines[2] = String.join("", "*     * *     * *     * ");
        bannerLines[3] = String.join("", "*     * *     * *     * ");
        bannerLines[4] = String.join("", "*     * *     * *     * ");
        bannerLines[5] = String.join("", " *****   *****   *****  ");

        // Step 3: Print banner using Enhanced For Loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
