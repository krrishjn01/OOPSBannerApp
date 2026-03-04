/**
 * OOPSBannerApp UC5 Render OOPS as Banner using Inline Array Initialization
 * * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each 
 * line of the banner. 
 * * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // Define and initialize the String array in a single statement
        String[] lines = {
            String.join("", "  *** ", "   *** ", "  **** ", "   **** "),
            String.join("", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join("", " ** ** ", " ** ** ", " ** ** ", "  ** "),
            String.join("", " ** ** ", " ** ** ", " **** ", "    ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "       ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "      ** "),
            String.join("", "  *** ", "   *** ", "  ** ", "   **** ")
        };

        // Use a for-each loop to print each line of the banner 
        for (String line : lines) {
            System.out.println(line); 
        }
    }
}