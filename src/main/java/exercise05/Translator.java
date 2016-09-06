package exercise05;

/**
 * @author Mike Schmid
 */
public class Translator {

    private final TranslationDictionary dictionary;

    public Translator(TranslationDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(final String string) {
        return string + " means " + dictionary.lookup(string) + " in another language!"; // not really :)
    }

}
