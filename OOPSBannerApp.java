/**
 * OOPSBannerApp
 * UC7 – Store Character Pattern in a Class
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class that stores a character
     * and its 7-line banner pattern.
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character
         * @param pattern the banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern
     */
    public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
    }

    /**
     * Utility method to create P pattern
     */
    public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });
    }

    /**
     * Utility method to create S pattern
     */
    public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = createOPattern();
        CharacterPattern p = createPPattern();
        CharacterPattern s = createSPattern();

        CharacterPattern[] patterns = {o, o, p, s};

        // Build banner lines
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}