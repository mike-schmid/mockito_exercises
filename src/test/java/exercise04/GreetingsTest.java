package exercise04;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike Schmid
 */
public class GreetingsTest {

    // TODO: test all four cases! you are not allowed to mock or spy the "Greetings" class!

    @Test
    public void testSayHello() throws Exception {
        final Greetings greetings = new Greetings(new CurrentDateTime());

        Assert.assertEquals("Good morning!", greetings.sayHello());


        Assert.assertEquals("Good afternoon!", greetings.sayHello());


        Assert.assertEquals("Good night!", greetings.sayHello());


        Assert.assertEquals("Hi!", greetings.sayHello());

    }

}