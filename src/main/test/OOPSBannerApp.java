/**
 * OOPSBannerApp
 * <p>
 * OOPS Banner Display Application
 * <p>
 * This is the initial setup for the OOPS Banner App project.
 *
 * @author Developer
 * @version 1.0
 */
public class OOPSBannerApp {

    public static String[] getOPattern() {
        return new String[]{
                String.join("", "   ***   "),
                String.join("", " **   ** "),
                String.join("", "**     **"),
                String.join("", "**     **"),
                String.join("", "**     **"),
                String.join("", " **   ** "),
                String.join("", "   ***   ")
        };
    }

    // Helper method to build pattern for character 'P'
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "******   "),
                String.join("", "**    ** "),
                String.join("", "**    ** "),
                String.join("", "*******  "),
                String.join("", "**       "),
                String.join("", "**       "),
                String.join("", "**       ")
        };
    }

    // Helper method to build pattern for character 'S'
    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  ****** "),
                String.join("", "**       "),
                String.join("", "**       "),
                String.join("", " ******* "),
                String.join("", "       **"),
                String.join("", "       **"),
                String.join("", " ******  ")
        };
    }

    // Main method – Application entry point
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop-based banner rendering
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + " " +
                            oPattern[i] + " " +
                            pPattern[i] + " " +
                            sPattern[i]
            );
        }
    }


}