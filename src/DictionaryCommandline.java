/**
 * Manages the command-line interface of the dictionary.
 */
public class DictionaryCommandline {
    private DictionaryManagement dictionaryManagement; // Manages dictionary operations

    /**
     * Constructs a new DictionaryCommandline object with a DictionaryManagement instance.
     */
    public DictionaryCommandline() {
        dictionaryManagement = new DictionaryManagement();
    }

    /**
     * Displays all words in the dictionary along with their English and Vietnamese meanings.
     *
     * @param dictionary The dictionary to display.
     */
    public void showAllWords(Dictionary dictionary) {
        System.out.println("No  | English              | Vietnamese");
        for (int i = 0; i < dictionaryManagement.getCount(); i++) {
            Word word = dictionary.getWord(i);
            System.out.printf("%-3d | %-20s | %-20s\n", i + 1, word.getWord_target(), word.getWord_explain());
        }
    }

    /**
     * Performs basic dictionary operations: inserts words from the command line input and displays all words.
     *
     * @param dictionary The dictionary to operate on.
     */
    public void dictionaryBasic(Dictionary dictionary) {
        dictionaryManagement.insertFromCommandLine(dictionary);
        showAllWords(dictionary);
    }
}
