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

        String[] bannerLines = new String[7];

        bannerLines[0] = String.join(" ","   ***   ","    ***    ","******   ","  ****** ");
        bannerLines[1] = String.join(" "," **   ** ","  **   **  ","**    ** ","**       ");
        bannerLines[2] = String.join(" ","**     **"," **     ** ","**    ** ","**       ");
        bannerLines[3] = String.join(" ","**     **"," **     ** ","*******  "," ******* ");
        bannerLines[4] = String.join(" ","**     **"," **     ** ","**       ","       **");
        bannerLines[5] = String.join(" "," **   ** ","  **   **  ","**       ","       **");
        bannerLines[6] = String.join(" ","   ***   ","    ***    ","**       "," ******* ");

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

}