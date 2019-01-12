package cs1302.exceptions;

/**
 * A utility class for printing lines from files using <code>Scanner</code> objects.
 */
public class Printer {

    /**
     * Prints lines using the given <code>Scanner</code> object.
     *
     * @param s  the given scanner
     */
    public static void printLines(Scanner s) {
        while (s.hasNextLine()) {
            String line = s.nextLine();
            System.out.println(line);
        } // while
    } // print

} // Printer

