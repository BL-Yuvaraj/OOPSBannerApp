/**
 * OOPSBannerApp
 *
 * OOPS Banner Display Application
 *
 * This is the initial setup for the OOPS Banner App project.
 *
 * @author Developer
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
                String.join(" ", "   ***   ", "    ***    ", "******   ", "  ****** "),
                String.join(" ", " **   ** ", "  **   **  ", "**    ** ", "**       "),
                String.join(" ", "**     **", " **     ** ", "**    ** ", "**       "),
                String.join(" ", "**     **", " **     ** ", "*******  ", " ******* "),
                String.join(" ", "**     **", " **     ** ", "**       ", "       **"),
                String.join(" ", " **   ** ", "  **   **  ", "**       ", "       **"),
                String.join(" ", "   ***   ", "    ***    ", "**       ", " ******* "),
        };
        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }


}