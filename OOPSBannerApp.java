/**
 * OOPSBannerApp UC6: OOPS Banner Application (Use Case 6)
 * * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 * * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {

    /**
     * Method to generate the pattern for the letter 'O'
     * Returns a String array representing the 7-line ASCII pattern.
     */
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "  ***  "
        };
    }

    /**
     * Method to generate the pattern for the letter 'P'
     */
    public static String[] getPPattern() {
        return new String[] {
            " ****  ",
            " ** ** ",
            " ** ** ",
            " ****  ",
            " **    ",
            " **    ",
            " **    "
        };
    }

    /**
     * Method to generate the pattern for the letter 'S'
     */
    public static String[] getSPattern() {
        return new String[] {
            "  ****  ",
            "**      ",
            " **     ",
            "   **   ",
            "     ** ",
            "    **  ",
            " ****   "
        };
    }

    /**
     * Main method to run the banner display
     */
    public static void main(String[] args) {
        // Step 1: Declare String Arrays and populate them by calling helper methods [cite: 573]
        String[] oPattern = getOPattern(); // Reused for both 'O's 
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 2: Use a loop to assemble and print each line of the "OOPS" banner
        // Since all patterns are 7 lines high, we iterate from 0 to 6
        for (int i = 0; i < oPattern.length; i++) {
            // Combine patterns line by line with spacing for visual effect
            System.out.println(" " + oPattern[i] + " " + oPattern[i] + "  " + pPattern[i] + " " + sPattern[i]);
        }
    }
}