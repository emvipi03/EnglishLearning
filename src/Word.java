import java.util.Scanner;

/**
 * Represents a word in the dictionary.
 */
public class Word implements Comparable<Word> {
    private String word_target; // The target word
    private String word_explain; // The explanation of the word

    /**
     * Constructs a new Word object with the specified target word and explanation.
     *
     * @param word_target  The target word.
     * @param word_explain The explanation of the word.
     */
    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }

    /**
     * Gets the target word.
     *
     * @return The target word.
     */
    public String getWord_target() {
        return word_target;
    }

    /**
     * Sets the target word.
     *
     * @param word_target The target word to set.
     */
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    /**
     * Gets the explanation of the word.
     *
     * @return The explanation of the word.
     */
    public String getWord_explain() {
        return word_explain;
    }

    /**
     * Sets the explanation of the word.
     *
     * @param word_explain The explanation of the word to set.
     */
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    /**
     * Compares this Word object with the specified Word object for order.
     *
     * @param other The Word object to be compared.
     * @return A negative integer, zero, or a positive integer as this Word object is less than, equal to,
     *         or greater than the specified Word object.
     */
    @Override
    public int compareTo(Word other) {
        return this.word_target.compareTo(other.getWord_target());
    }
}
