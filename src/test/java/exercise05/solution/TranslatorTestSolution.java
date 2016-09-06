package exercise05.solution;

import exercise05.TranslationDictionary;
import exercise05.Translator;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Mike Schmid
 */
@RunWith(MockitoJUnitRunner.class)
public class TranslatorTestSolution {

    private Translator translator;

    @Before
    public void setUp(){
        final TranslationDictionary dictionary = mock(TranslationDictionary.class);
        when(dictionary.lookup(anyString())).thenAnswer(i -> StringUtils.reverse(i.getArgumentAt(0, String.class)));

        translator = new Translator(dictionary);
    }

    @Test
    public void testTranslate() throws Exception {
        Assert.assertEquals("apple means elppa in another language!", translator.translate("apple"));
        Assert.assertEquals("cake means ekac in another language!", translator.translate("cake"));
    }
}