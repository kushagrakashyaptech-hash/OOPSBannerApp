/**
 * UC7 - Store Character Pattern in an Inner Static Class
 * Demonstrates encapsulation and modular banner rendering.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class that encapsulates character and pattern
     */
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character banner character
         * @param pattern 7-line pattern of character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for pattern row
         * @param row index (0–6)
         * @return pattern string at row
         */
        public String getPatternRow(int row) {
            return pattern[row];
        }

        /**
         * Getter for character
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }
    }

    // Utility method to create O pattern
    public static CharacterPattern createO() {
        return new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    // Utility method to create P pattern
    public static CharacterPattern createP() {
        return new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });
    }

    // Utility method to create S pattern
    public static CharacterPattern createS() {
        return new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        CharacterPattern[] letters = {
                createO(),
                createO(),
                createP(),
                createS()
        };

        String[] banner = new String[7];

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern letter : letters) {
                line.append(letter.getPatternRow(row)).append("  ");
            }

            banner[row] = line.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}