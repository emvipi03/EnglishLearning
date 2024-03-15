import java.util.ArrayList;

/**
 * Represents a dictionary containing a list of words.
 */
public class Dictionary {
    private ArrayList<Word> words; // The list of words in the dictionary

    /**
     * Constructs a new Dictionary object with an empty list of words.
     */
    public Dictionary() {
        words = new ArrayList<>();
    }

    /**
     * Adds a new word to the dictionary while maintaining alphabetical order.
     *
     * @param word The word to add to the dictionary.
     */
    public void addWord(Word word) {
        words.add(word); // Add the word to the end of the list
        int i = words.size() - 2;
        // Shift elements to the right until finding the correct position for the new word
        while (i >= 0 && words.get(i).compareTo(word) > 0) {
            words.set(i + 1, words.get(i));
            i--;
        }
        words.set(i + 1, word); // Insert the new word at the correct position
    }

    /**
     * Gets the word at the specified index in the dictionary.
     *
     * @param index The index of the word to retrieve.
     * @return The word at the specified index.
     */
    public Word getWord(int index) {
        return words.get(index);
    }
}
