import java.util.HashMap;
import java.util.Map;

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
     * Converts CharacterPatternMap array to Map for efficient lookup.
     *
     * @param charMaps array of character pattern mappings
     * @return Map of character to pattern
     */
    public static Map<Character, String[]> createCharacterPatternMap(CharacterPatternMap[] charMaps) {

        Map<Character, String[]> patternMap = new HashMap<>();

        for (CharacterPatternMap map : charMaps) {
            patternMap.put(map.getCharacter(), map.getPattern());
        }

        return patternMap;
    }

    /**
     * Prints the message as a banner.
     *
     * @param message  message to print
     * @param patternMap available character patterns
     */
    public static void printMessage(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                String[] pattern = patternMap.getOrDefault(
                        ch,
                        patternMap.get(' ')
                );

                line.append(pattern[row]);

                // Add space ONLY between characters
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
        Map<Character, String[]> patternMap = createCharacterPatternMap(charMaps);

        String message = "OOPS";

        printMessage(message, patternMap);
    }
}