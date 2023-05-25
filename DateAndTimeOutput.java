import java.util.Scanner;
import java.awt.*;
import java.awt.datatransfer.*;

public class DateAndTimeOutput {
    public static void main(String[] args) {
        String currentDate = java.time.LocalDate.now().toString();
        String currentTime = java.time.LocalTime.now().toString().substring(0, 8);
        String dashes = "-".repeat(20);

        // Generate the output string with the current date, time, and dashes
        String output = currentDate + " " + currentTime + System.lineSeparator() + dashes;

        // Copy the output to the clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(output), null);

        // Prompt the user to press the spacebar to end the program
        System.out.println("Output has been copied to the clipboard. Press the spacebar to end the program...");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.nextLine().equals(" ")) {
                break;
            }
        }
    }
}
