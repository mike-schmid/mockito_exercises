package exercise05;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Exercise 05 - The answer!
 *
 * @author Mike Schmid
 */
public class TranslatorTest {

    private Translator translator;

    // TODO: the lookup in the TranslationDictionary is pretty slow. Our goal is not to test the lookup but the translator class.
    // Mock the lookup method, so that it always returns the reversed input parameter. You might want to use Mockitos Answer class to achieve this.

    @Before
    public void setUp() {
        translator = new Translator(new TranslationDictionary());
    }

    @Test
    public void testTranslate() throws Exception {
        Assert.assertEquals("apple means öpfel in another language!", translator.translate("apple"));
        Assert.assertEquals("cake means chuechä in another language!", translator.translate("cake"));
    }
}