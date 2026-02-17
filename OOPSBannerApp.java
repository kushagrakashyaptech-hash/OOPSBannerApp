/**
 * OOPSBannerApp
 *
 * UC4 - Display OOPS Banner using String Array and Loop
 *
 * @author YourName
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] banner = new String[7];

        // Populate each line using String.join()

        banner[0] = String.join("",
                " *******   ",
                " *******   ",
                " ********  ",
                " *******  ");

        banner[1] = String.join("",
                " *       * ",
                " *       * ",
                " *       * ",
                " *       * ");

        banner[2] = String.join("",
                " *       * ",
                " *       * ",
                " *       * ",
                " *         ");

        banner[3] = String.join("",
                " *       * ",
                " *       * ",
                " ********  ",
                " *******  ");

        banner[4] = String.join("",
                " *       * ",
                " *       * ",
                " *         ",
                "         * ");

        banner[5] = String.join("",
                " *       * ",
                " *       * ",
                " *         ",
                " *       * ");

        banner[6] = String.join("",
                " *******   ",
                " *******   ",
                " *         ",
                " *******  ");

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
