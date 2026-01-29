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

    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character pattern mapping.
         *
         * @param character the character
         * @param pattern   7-line ASCII pattern (each line width = 9)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern.
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates predefined character patterns.
     *
     * @return array of CharacterPatternMap
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', new String[]{
                        "   ***   ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "   ***   "
                }),
                new CharacterPatternMap('P', new String[]{
                        "******   ",
                        "**    ** ",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       ",
                        "**       "
                }),
                new CharacterPatternMap('S', new String[]{
                        " ******  ",
                        "**       ",
                        "**       ",
                        " ******  ",
                        "       **",
                        "       **",
                        " ******  "
                }),
                new CharacterPatternMap(' ', new String[]{
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "         "
                })
        };
    }

    /**
     * Retrieves pattern for a given character.
     *
     * @param ch       character to look up
     * @param charMaps character pattern mappings
     * @return ASCII pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // fallback to space
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints the message as a banner.
     *
     * @param message  message to print
     * @param charMaps available character patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                line.append(getCharacterPattern(ch, charMaps)[row]);

                // Add space ONLY between characters, not at end
                if (i < message.length() - 1) {
                    line.append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }


    /**
     * Main entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to OOPS Banner Application");

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";

        printMessage(message, charMaps);
    }

}