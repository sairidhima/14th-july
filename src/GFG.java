import java.io.*;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Declaring and initializing variables

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        int number = 5;

        int m, n;

        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 2; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (n = 2; n <= m * 2 - 1; n++) {
                System.out.print("-");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 2; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (n = 2; n <= m * 2 - 1; n++) {
                System.out.print("-");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}