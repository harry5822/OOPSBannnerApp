/**
 * OOPSBannerApp
 * UC5 – Render OOPS banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one step
        String[] banner = {
            String.join(" ", " *** ", " *** ", " **** ", " **** "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "**** ", " *** "),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", " *** ", " *** ", "*    ", "**** ")
        };

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}