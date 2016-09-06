package exercise05;

import com.sun.tools.javac.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Mike Schmid
 */
public class TranslationDictionary {

    final static Map<String, String> map = new HashMap<>();

    public String lookup(final String string) {
        try {
            TimeUnit.SECONDS.sleep(5); // Simulate slow translation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return map.getOrDefault(StringUtils.toLowerCase(string), "???");
    }

    static {
        map.put("apple", "öpfel");
        map.put("cake", "chuechä");
        map.put("sun", "sunnä");
    }

}
