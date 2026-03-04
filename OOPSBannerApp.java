/**
 * OOPSBannerApp UC3: OOPS Banner Application (Use Case 3)
 * * This class extends the functionality of Use Case 2 by improving the way the "OOPS" 
 * banner is constructed and displayed. It utilizes the String.join() method to 
 * enhance code readability and memory efficiency[cite: 78, 81].
 * * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // Construct each line using String.join() for better efficiency [cite: 117]
        // Requirement: Use empty string "" or " " as per hints [cite: 23, 26, 38]
        
        // Line 1
        System.out.println(String.join("", " *** ", "  *** ", " **** ", "  **** "));
        
        // Line 2
        System.out.println(String.join("", "** **", " ** **", " ** **", " ** "));
        
        // Line 3
        System.out.println(String.join("", "** **", " ** **", " ** **", "  ** "));
        
        // Line 4
        System.out.println(String.join("", "** **", " ** **", " **** ", "    ** "));
        
        // Line 5
        System.out.println(String.join("", "** **", " ** **", " ** ", "       ** "));
        
        // Line 6
        System.out.println(String.join("", "** **", " ** **", " ** ", "      **"));
        
        // Line 7
        System.out.println(String.join("", " *** ", "  *** ", " ** ", "   **** "));
    }
}