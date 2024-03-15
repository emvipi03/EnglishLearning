import java.util.Scanner;

/**
 * Manages the input and output operations of the dictionary.
 */
public class DictionaryManagement {
    private Scanner scanner; // Scanner object for reading input
    private int count; // Number of words in the dictionary

    /**
     * Constructs a new DictionaryManagement object with a Scanner for input.
     */
    public DictionaryManagement() {
        scanner = new Scanner(System.in);
        count = 0; // Initialize word count to 0
    }

    /**
     * Inserts words into the dictionary from the command line input.
     *
     * @param dictionary The dictionary to insert words into.
     */
    public void insertFromCommandLine(Dictionary dictionary) {
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()
        count = n; // Update the word count
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            String target = scanner.nextLine();
            System.out.print("Enter explanation for word " + (i + 1) + ": ");
            String explain = scanner.nextLine();
            dictionary.addWord(new Word(target, explain));
        }
    }

    /**
     * Gets the count of words in the dictionary.
     *
     * @return The count of words in the dictionary.
     */
    public int getCount() {
        return count;
    }

    /**
     * Closes the Scanner object.
     */
    public void closeScanner() {
        scanner.close();
    }
}
